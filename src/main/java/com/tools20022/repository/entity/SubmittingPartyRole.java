/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the party which submits trade data sets to a system or to a
 * counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SubmittingPartyRole" src="doc-files/SubmittingPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission2
 * RequiredSubmission2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmSubmittingParty
 * TradePartyIdentification2.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmSubmittingParty
 * TradePartyIdentification3.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification5#mmSubmittingParty
 * TradePartyIdentification5.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification1#mmSubmittingParty
 * TradePartyIdentification1.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmSubmittingParty
 * TradePartyIdentification4.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmSubmittingParty
 * SecuritiesTransactionReport2.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmSubmittingParty
 * SecuritiesTransactionReport4.mmSubmittingParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubmittingPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the party which submits trade data sets to a system or to a counterparty."
 * </li>
 * </ul>
 */
public class SubmittingPartyRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubmittingPartyRole";
				definition = "Specifies the party which submits trade data sets to a system or to a counterparty.";
				derivationElement_lazy = () -> Arrays.asList(TradePartyIdentification2.mmSubmittingParty, TradePartyIdentification3.mmSubmittingParty, TradePartyIdentification5.mmSubmittingParty,
						TradePartyIdentification1.mmSubmittingParty, TradePartyIdentification4.mmSubmittingParty, SecuritiesTransactionReport2.mmSubmittingParty, SecuritiesTransactionReport4.mmSubmittingParty);
				superType_lazy = () -> SystemPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(RequiredSubmission2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubmittingPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}