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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.IntraBalanceOrOperationalError1Choice;
import com.tools20022.repository.choice.IntraBalanceOrOperationalError2Choice;
import com.tools20022.repository.choice.IntraBalanceOrOperationalError3Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Movement of cash between two accounts. One account is debited and the other
 * account is credited.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BookEntry" src="doc-files/BookEntry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CashEntry
 * BookEntry.CashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#DebitEntry
 * BookEntry.DebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#CreditEntry
 * BookEntry.CreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#TransferAdvice
 * BookEntry.TransferAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#FundSubscriptionCashInFlow
 * BookEntry.FundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#FundRedemptionCashOutFlow
 * BookEntry.FundRedemptionCashOutFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#RelatedSettlementInstruction
 * BookEntry.RelatedSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#RelatedBookEntry
 * CashEntry.RelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#DebitRelatedBookEntry
 * CashEntry.DebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#CreditRelatedBookEntry
 * CashEntry.CreditRelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#BookEntry
 * CashSettlement.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundSubscriptionAccountEntry
 * FundsCashFlow.FundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundRedemptionAccountEntry
 * FundsCashFlow.FundRedemptionAccountEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#PaymentMethod
 * PaymentDetails5.PaymentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#PaymentMethod
 * PaymentDetails6.PaymentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#PaymentMethod
 * PaymentDetails7.PaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#FinancingDateDetails
 * FinancingAllowedSummary1.FinancingDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#UnderlyingIntraBalance
 * IntraBalanceCancellation2.UnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#Cancellation
 * IntraBalanceCancellation1.Cancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError2Choice#Cancellations
 * IntraBalanceOrOperationalError2Choice.Cancellations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#MovementDetails
 * IntraBalanceMovement1.MovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#Movement
 * IntraBalanceMovements1.Movement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError1Choice#Movements
 * IntraBalanceOrOperationalError1Choice.Movements}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending1#Movement
 * IntraBalancePending1.Movement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#UnderlyingIntraBalance
 * IntraBalanceModification2.UnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#Modification
 * IntraBalanceModification1.Modification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError3Choice#Modifications
 * IntraBalanceOrOperationalError3Choice.Modifications}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingDateDetails1
 * FinancingDateDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1 IntraBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2
 * IntraBalanceCancellation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1
 * IntraBalanceCancellation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError2Choice
 * IntraBalanceOrOperationalError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovement2
 * IntraBalanceMovement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovement1
 * IntraBalanceMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovements1
 * IntraBalanceMovements1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError1Choice
 * IntraBalanceOrOperationalError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
 * IntraBalanceQueryCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending2
 * IntraBalancePending2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending1
 * IntraBalancePending1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePosting2
 * IntraBalancePosting2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePosting1
 * IntraBalancePosting1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceType1
 * IntraBalanceType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceModification2
 * IntraBalanceModification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceModification1
 * IntraBalanceModification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError3Choice
 * IntraBalanceOrOperationalError3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3
 * IntraBalanceQueryCriteria3}</li>
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
 * "BookEntry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Movement of cash between two accounts. One account is debited and the other account is credited."
 * </li>
 * </ul>
 */
public class BookEntry extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the amount transferred on the account. An account entry may
	 * result in several cash entries for instance net amount (credited) and
	 * charges (debited).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#RelatedBookEntry
	 * CashEntry.RelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#AccountEntry
	 * Transaction3.AccountEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#AccountEntry
	 * Transaction4.AccountEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#AccountEntry
	 * Transaction5.AccountEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#AccountEntry
	 * Transaction24.AccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#CashMovementDetails
	 * CorporateActionElection3.CashMovementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#AccountEntry
	 * Transaction33.AccountEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction3.AccountEntry, com.tools20022.repository.msg.Transaction4.AccountEntry, com.tools20022.repository.msg.Transaction5.AccountEntry,
					com.tools20022.repository.msg.Transaction24.AccountEntry, com.tools20022.repository.msg.CorporateActionElection3.CashMovementDetails, com.tools20022.repository.msg.Transaction33.AccountEntry);
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited).";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the debit entry resuling from a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#DebitRelatedBookEntry
	 * CashEntry.DebitRelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the debit entry resuling from a settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DebitEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitEntry";
			definition = "Specifies the debit entry resuling from a settlement instruction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the credit entry resuling from a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CreditRelatedBookEntry
	 * CashEntry.CreditRelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the credit entry resuling from a settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditEntry";
			definition = "Specifies the credit entry resuling from a settlement instruction.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates that when an amount of money has been transferred in the books
	 * of the account servicer, an advice should be sent back to the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferAdvice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money received from investors as a result of a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundSubscriptionAccountEntry
	 * FundsCashFlow.FundSubscriptionAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundSubscriptionCashInFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money received from investors as a result of a subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundSubscriptionCashInFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionCashInFlow";
			definition = "Amount of money received from investors as a result of a subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money paid to investors as a result of a redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#FundRedemptionAccountEntry
	 * FundsCashFlow.FundRedemptionAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundRedemptionCashOutFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to investors as a result of a redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundRedemptionCashOutFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionCashOutFlow";
			definition = "Amount of money paid to investors as a result of a redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FundsCashFlow.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Related settlement instruction wich is the source of the book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#BookEntry
	 * CashSettlement.BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related settlement instruction wich is the source of the book entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BookEntry.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Related settlement instruction wich is the source of the book entry.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.BookEntry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BookEntry";
				definition = "Movement of cash between two accounts. One account is debited and the other account is credited.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.RelatedBookEntry, com.tools20022.repository.entity.CashEntry.DebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.CreditRelatedBookEntry, com.tools20022.repository.entity.CashSettlement.BookEntry, com.tools20022.repository.entity.FundsCashFlow.FundSubscriptionAccountEntry,
						com.tools20022.repository.entity.FundsCashFlow.FundRedemptionAccountEntry);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDetails5.PaymentMethod, com.tools20022.repository.msg.PaymentDetails6.PaymentMethod,
						com.tools20022.repository.msg.PaymentDetails7.PaymentMethod, com.tools20022.repository.msg.FinancingAllowedSummary1.FinancingDateDetails,
						com.tools20022.repository.msg.IntraBalanceCancellation2.UnderlyingIntraBalance, com.tools20022.repository.msg.IntraBalanceCancellation1.Cancellation,
						com.tools20022.repository.choice.IntraBalanceOrOperationalError2Choice.Cancellations, com.tools20022.repository.msg.IntraBalanceMovement1.MovementDetails,
						com.tools20022.repository.msg.IntraBalanceMovements1.Movement, com.tools20022.repository.choice.IntraBalanceOrOperationalError1Choice.Movements, com.tools20022.repository.msg.IntraBalancePending1.Movement,
						com.tools20022.repository.msg.IntraBalanceModification2.UnderlyingIntraBalance, com.tools20022.repository.msg.IntraBalanceModification1.Modification,
						com.tools20022.repository.choice.IntraBalanceOrOperationalError3Choice.Modifications);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BookEntry.CashEntry, com.tools20022.repository.entity.BookEntry.DebitEntry, com.tools20022.repository.entity.BookEntry.CreditEntry,
						com.tools20022.repository.entity.BookEntry.TransferAdvice, com.tools20022.repository.entity.BookEntry.FundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.FundRedemptionCashOutFlow,
						com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction);
				derivationComponent_lazy = () -> Arrays.asList(FinancingDateDetails1.mmObject(), IntraBalance2.mmObject(), IntraBalance1.mmObject(), IntraBalanceCancellation2.mmObject(), IntraBalanceCancellation1.mmObject(),
						IntraBalanceOrOperationalError2Choice.mmObject(), IntraBalanceMovement2.mmObject(), IntraBalanceMovement1.mmObject(), IntraBalanceMovements1.mmObject(), IntraBalanceOrOperationalError1Choice.mmObject(),
						IntraBalanceQueryCriteria2.mmObject(), IntraBalancePending2.mmObject(), IntraBalancePending1.mmObject(), IntraBalancePosting2.mmObject(), IntraBalancePosting1.mmObject(), IntraBalanceType1.mmObject(),
						IntraBalanceModification2.mmObject(), IntraBalanceModification1.mmObject(), IntraBalanceOrOperationalError3Choice.mmObject(), IntraBalanceQueryCriteria3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}