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
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.msg.PartyIdentification72;
import com.tools20022.repository.msg.TaxReport1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that buys assets, good or services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BuyerRole" src="doc-files/BuyerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties3#Buyer
 * ConfirmationParties3.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4#Buyer
 * ConfirmationParties4.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2#Buyer
 * ConfirmationParties2.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement6#Buyer
 * TradeAgreement6.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#Payee
 * TradeSettlement1.Payee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportSpecification4#Buyer
 * ReportSpecification4.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#Buyer
 * TradeContract1.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Buyer
 * LoanContract1.Buyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification79#DecisionMaker
 * PartyIdentification79.DecisionMaker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#Buyer
 * TaxReport1.Buyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#Buyer
 * TradeAgreement13.Buyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#Buyer
 * SecuritiesTransactionReport4.Buyer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification72
 * PartyIdentification72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1 TaxReport1}</li>
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
 * "BuyerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that buys assets, good or services."</li>
 * </ul>
 */
public class BuyerRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BuyerRole";
				definition = "Party that buys assets, good or services.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationParties3.Buyer, com.tools20022.repository.msg.ConfirmationParties4.Buyer, com.tools20022.repository.msg.ConfirmationParties2.Buyer,
						com.tools20022.repository.msg.TradeAgreement6.Buyer, com.tools20022.repository.msg.TradeSettlement1.Payee, com.tools20022.repository.msg.ReportSpecification4.Buyer,
						com.tools20022.repository.msg.TradeContract1.Buyer, com.tools20022.repository.msg.LoanContract1.Buyer, com.tools20022.repository.msg.PartyIdentification79.DecisionMaker,
						com.tools20022.repository.msg.TaxReport1.Buyer, com.tools20022.repository.msg.TradeAgreement13.Buyer, com.tools20022.repository.msg.SecuritiesTransactionReport4.Buyer);
				superType_lazy = () -> TradePartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(PartyIdentification72.mmObject(), TaxReport1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}