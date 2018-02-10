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

import com.tools20022.repository.choice.Counterparty11Choice;
import com.tools20022.repository.choice.Counterparty12Choice;
import com.tools20022.repository.msg.*;
import java.util.List;

class ListBuilderForParty_05 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) SettlementParties63.mmParty4);
		list.add((T) SettlementParties63.mmParty5);
		list.add((T) Counterparty11Choice.mmSeller);
		list.add((T) Counterparty11Choice.mmBuyer);
		list.add((T) TransactionDetails106.mmAccountOwner);
		list.add((T) TransactionDetails107.mmInvestor);
		list.add((T) QuantityAndAccount65.mmAccountOwner);
		list.add((T) QuantityAndAccount66.mmAccountOwner);
		list.add((T) QuantityAndAccount68.mmAccountOwner);
		list.add((T) CorporateActionOption141.mmAccountOwner);
		list.add((T) AccountIdentification43.mmAccountOwner);
		list.add((T) Case4.mmCreator);
		list.add((T) CaseAssignment4.mmAssigner);
		list.add((T) CaseAssignment4.mmAssignee);
		list.add((T) GroupHeader74.mmInitiatingParty);
		list.add((T) PaymentCancellationReason4.mmOriginator);
		list.add((T) GroupHeader75.mmInitiatingParty);
		list.add((T) StructuredRemittanceInformation15.mmInvoicer);
		list.add((T) TaxInformation7.mmUltimateDebtor);
		list.add((T) Garnishment2.mmGarnishmentAdministrator);
		list.add((T) StatusReasonInformation11.mmOriginator);
		list.add((T) PaymentReversalReason8.mmOriginator);
		list.add((T) AmendmentInformationDetails12.mmOriginalCreditorSchemeIdentification);
		list.add((T) AmendmentInformationDetails12.mmOriginalDebtor);
		list.add((T) CorporateActionOption144.mmAccountOwner);
		list.add((T) AccountIdentification44.mmAccountOwner);
		list.add((T) SettlementParties64.mmDepository);
		list.add((T) SettlementParties64.mmParty1);
		list.add((T) SettlementParties64.mmParty2);
		list.add((T) SettlementParties64.mmParty3);
		list.add((T) SettlementParties64.mmParty4);
		list.add((T) SettlementParties64.mmParty5);
		list.add((T) StandingSettlementInstruction15.mmVendor);
		list.add((T) Counterparty12Choice.mmSeller);
		list.add((T) Counterparty12Choice.mmBuyer);
		list.add((T) QuantityAndAccount69.mmAccountOwner);
		list.add((T) QuantityAndAccount70.mmAccountOwner);
		list.add((T) QuantityAndAccount72.mmAccountOwner);
		list.add((T) TransactionDetails108.mmAccountOwner);
		list.add((T) TransactionDetails109.mmInvestor);
		list.add((T) QuantityAndAccount75.mmAccountOwner);
		list.add((T) SettlementParties73.mmParty2);
		list.add((T) SettlementParties73.mmParty3);
		list.add((T) SettlementParties73.mmParty4);
		list.add((T) SettlementParties73.mmParty5);
		list.add((T) QuantityAndAccount76.mmAccountOwner);
		list.add((T) TransactionDetails110.mmAccountOwner);
		list.add((T) TransactionDetails110.mmInvestor);
		list.add((T) TransactionDetails110.mmQualifiedForeignIntermediary);
		list.add((T) SubAccountIdentification52.mmAccountOwner);
		list.add((T) MessageReference1.mmReferenceIssuer);
		list.add((T) Creditor3.mmCreditor);
		list.add((T) TradeParty4.mmPartyIdentification);
		list.add((T) Debtor3.mmDebtor);
		list.add((T) Cardholder13.mmIdentification);
		return list;
	}
}