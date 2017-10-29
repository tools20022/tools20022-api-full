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
import com.tools20022.repository.entity.MandatePartyRole;
import com.tools20022.repository.msg.PartyAndCertificate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that was given by another entity the authority to act on its behalf.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MandateHolder" src="doc-files/MandateHolder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#PowerOfAttorney
 * AccountParties2.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#PowerOfAttorney
 * AccountParties5.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#PowerOfAttorney
 * AccountParties6.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#PowerOfAttorney
 * AccountParties3.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#PowerOfAttorney
 * AccountParties4.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#PowerOfAttorney
 * AccountParties7.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#MandateHolder
 * OperationMandate2.MandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate3#MandateHolder
 * OperationMandate3.MandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#PowerOfAttorney
 * AccountParties9.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#PowerOfAttorney
 * AccountParties8.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#PowerOfAttorney
 * AccountParties11.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#PowerOfAttorney
 * AccountParties10.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#PowerOfAttorney
 * AccountParties12.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#PowerOfAttorney
 * AccountParties13.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#PowerOfAttorney
 * AccountParties14.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#PowerOfAttorney
 * AccountParties15.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#PowerOfAttorney
 * AccountParties16.PowerOfAttorney}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.MandatePartyRole
 * MandatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndCertificate1
 * PartyAndCertificate1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateHolder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that was given by another entity the authority to act on its behalf."
 * </li>
 * </ul>
 */
public class MandateHolder extends MandatePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateHolder";
				definition = "Entity that was given by another entity the authority to act on its behalf.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.PowerOfAttorney, com.tools20022.repository.msg.AccountParties5.PowerOfAttorney,
						com.tools20022.repository.msg.AccountParties6.PowerOfAttorney, com.tools20022.repository.msg.AccountParties3.PowerOfAttorney, com.tools20022.repository.msg.AccountParties4.PowerOfAttorney,
						com.tools20022.repository.msg.AccountParties7.PowerOfAttorney, com.tools20022.repository.msg.OperationMandate2.MandateHolder, com.tools20022.repository.msg.OperationMandate3.MandateHolder,
						com.tools20022.repository.msg.AccountParties9.PowerOfAttorney, com.tools20022.repository.msg.AccountParties8.PowerOfAttorney, com.tools20022.repository.msg.AccountParties11.PowerOfAttorney,
						com.tools20022.repository.msg.AccountParties10.PowerOfAttorney, com.tools20022.repository.msg.AccountParties12.PowerOfAttorney, com.tools20022.repository.msg.AccountParties13.PowerOfAttorney,
						com.tools20022.repository.msg.AccountParties14.PowerOfAttorney, com.tools20022.repository.msg.AccountParties15.PowerOfAttorney, com.tools20022.repository.msg.AccountParties16.PowerOfAttorney);
				superType_lazy = () -> MandatePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyAndCertificate1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}