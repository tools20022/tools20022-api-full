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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
 * BookEntry.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
 * BookEntry.mmDebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
 * BookEntry.mmCreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmTransferAdvice
 * BookEntry.mmTransferAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
 * BookEntry.mmFundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
 * BookEntry.mmFundRedemptionCashOutFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
 * CashEntry.mmRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
 * CashEntry.mmDebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
 * CashEntry.mmCreditRelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentMethod
 * PaymentDetails5.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPaymentMethod
 * PaymentDetails6.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPaymentMethod
 * PaymentDetails7.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAllowedSummary1#mmFinancingDateDetails
 * FinancingAllowedSummary1.mmFinancingDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmUnderlyingIntraBalance
 * IntraBalanceCancellation2.mmUnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#mmCancellation
 * IntraBalanceCancellation1.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError2Choice#mmCancellations
 * IntraBalanceOrOperationalError2Choice.mmCancellations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmMovementDetails
 * IntraBalanceMovement1.mmMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#mmMovement
 * IntraBalanceMovements1.mmMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError1Choice#mmMovements
 * IntraBalanceOrOperationalError1Choice.mmMovements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending1#mmMovement
 * IntraBalancePending1.mmMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmUnderlyingIntraBalance
 * IntraBalanceModification2.mmUnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#mmModification
 * IntraBalanceModification1.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError3Choice#mmModifications
 * IntraBalanceOrOperationalError3Choice.mmModifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePending3#mmMovement
 * IntraBalancePending3.mmMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError4Choice#mmMovements
 * IntraBalanceOrOperationalError4Choice.mmMovements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError6Choice#mmModifications
 * IntraBalanceOrOperationalError6Choice.mmModifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError5Choice#mmCancellations
 * IntraBalanceOrOperationalError5Choice.mmCancellations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3#mmCancellation
 * IntraBalanceCancellation3.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement3#mmMovementDetails
 * IntraBalanceMovement3.mmMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmUnderlyingIntraBalance
 * IntraBalanceCancellation4.mmUnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification4#mmUnderlyingIntraBalance
 * IntraBalanceModification4.mmUnderlyingIntraBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements2#mmMovement
 * IntraBalanceMovements2.mmMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification3#mmModification
 * IntraBalanceModification3.mmModification}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance3 IntraBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending3
 * IntraBalancePending3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError4Choice
 * IntraBalanceOrOperationalError4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError6Choice
 * IntraBalanceOrOperationalError6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance4 IntraBalance4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraBalanceOrOperationalError5Choice
 * IntraBalanceOrOperationalError5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePosting3
 * IntraBalancePosting3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceCancellation3
 * IntraBalanceCancellation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovement3
 * IntraBalanceMovement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovement4
 * IntraBalanceMovement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
 * IntraBalanceCancellation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceModification4
 * IntraBalanceModification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceType2
 * IntraBalanceType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePending4
 * IntraBalancePending4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceMovements2
 * IntraBalanceMovements2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
 * IntraBalanceQueryCriteria5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalancePosting4
 * IntraBalancePosting4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
 * IntraBalanceQueryCriteria6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceModification3
 * IntraBalanceModification3}</li>
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
	protected List<com.tools20022.repository.entity.CashEntry> cashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
	 * CashEntry.mmRelatedBookEntry}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction3#mmAccountEntry
	 * Transaction3.mmAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction4#mmAccountEntry
	 * Transaction4.mmAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction5#mmAccountEntry
	 * Transaction5.mmAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction24#mmAccountEntry
	 * Transaction24.mmAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmCashMovementDetails
	 * CorporateActionElection3.mmCashMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmAccountEntry
	 * Transaction33.mmAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction59#mmAccountEntry
	 * Transaction59.mmAccountEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, List<CashEntry>> mmCashEntry = new MMBusinessAssociationEnd<BookEntry, List<CashEntry>>() {
		{
			derivation_lazy = () -> Arrays.asList(Transaction3.mmAccountEntry, Transaction4.mmAccountEntry, Transaction5.mmAccountEntry, Transaction24.mmAccountEntry, CorporateActionElection3.mmCashMovementDetails,
					Transaction33.mmAccountEntry, Transaction59.mmAccountEntry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited).";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(BookEntry obj) {
			return obj.getCashEntry();
		}

		@Override
		public void setValue(BookEntry obj, List<CashEntry> value) {
			obj.setCashEntry(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> debitEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
	 * CashEntry.mmDebitRelatedBookEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, List<CashEntry>> mmDebitEntry = new MMBusinessAssociationEnd<BookEntry, List<CashEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitEntry";
			definition = "Specifies the debit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(BookEntry obj) {
			return obj.getDebitEntry();
		}

		@Override
		public void setValue(BookEntry obj, List<CashEntry> value) {
			obj.setDebitEntry(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> creditEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
	 * CashEntry.mmCreditRelatedBookEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, List<CashEntry>> mmCreditEntry = new MMBusinessAssociationEnd<BookEntry, List<CashEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditEntry";
			definition = "Specifies the credit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(BookEntry obj) {
			return obj.getCreditEntry();
		}

		@Override
		public void setValue(BookEntry obj, List<CashEntry> value) {
			obj.setCreditEntry(value);
		}
	};
	protected YesNoIndicator transferAdvice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BookEntry, YesNoIndicator> mmTransferAdvice = new MMBusinessAttribute<BookEntry, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BookEntry obj) {
			return obj.getTransferAdvice();
		}

		@Override
		public void setValue(BookEntry obj, YesNoIndicator value) {
			obj.setTransferAdvice(value);
		}
	};
	protected FundsCashFlow fundSubscriptionCashInFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
	 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, FundsCashFlow> mmFundSubscriptionCashInFlow = new MMBusinessAssociationEnd<BookEntry, FundsCashFlow>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionCashInFlow";
			definition = "Amount of money received from investors as a result of a subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FundsCashFlow.mmFundSubscriptionAccountEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}

		@Override
		public FundsCashFlow getValue(BookEntry obj) {
			return obj.getFundSubscriptionCashInFlow();
		}

		@Override
		public void setValue(BookEntry obj, FundsCashFlow value) {
			obj.setFundSubscriptionCashInFlow(value);
		}
	};
	protected FundsCashFlow fundRedemptionCashOutFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
	 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, FundsCashFlow> mmFundRedemptionCashOutFlow = new MMBusinessAssociationEnd<BookEntry, FundsCashFlow>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionCashOutFlow";
			definition = "Amount of money paid to investors as a result of a redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FundsCashFlow.mmFundRedemptionAccountEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}

		@Override
		public FundsCashFlow getValue(BookEntry obj) {
			return obj.getFundRedemptionCashOutFlow();
		}

		@Override
		public void setValue(BookEntry obj, FundsCashFlow value) {
			obj.setFundRedemptionCashOutFlow(value);
		}
	};
	protected CashSettlement relatedSettlementInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
	 * CashSettlement.mmBookEntry}</li>
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
	public static final MMBusinessAssociationEnd<BookEntry, CashSettlement> mmRelatedSettlementInstruction = new MMBusinessAssociationEnd<BookEntry, CashSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Related settlement instruction wich is the source of the book entry.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashSettlement.mmBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}

		@Override
		public CashSettlement getValue(BookEntry obj) {
			return obj.getRelatedSettlementInstruction();
		}

		@Override
		public void setValue(BookEntry obj, CashSettlement value) {
			obj.setRelatedSettlementInstruction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookEntry";
				definition = "Movement of cash between two accounts. One account is debited and the other account is credited.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry, com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry, CashSettlement.mmBookEntry, FundsCashFlow.mmFundSubscriptionAccountEntry, FundsCashFlow.mmFundRedemptionAccountEntry);
				derivationElement_lazy = () -> Arrays.asList(PaymentDetails5.mmPaymentMethod, PaymentDetails6.mmPaymentMethod, PaymentDetails7.mmPaymentMethod, FinancingAllowedSummary1.mmFinancingDateDetails,
						IntraBalanceCancellation2.mmUnderlyingIntraBalance, IntraBalanceCancellation1.mmCancellation, IntraBalanceOrOperationalError2Choice.mmCancellations, IntraBalanceMovement1.mmMovementDetails,
						IntraBalanceMovements1.mmMovement, IntraBalanceOrOperationalError1Choice.mmMovements, IntraBalancePending1.mmMovement, IntraBalanceModification2.mmUnderlyingIntraBalance, IntraBalanceModification1.mmModification,
						IntraBalanceOrOperationalError3Choice.mmModifications, IntraBalancePending3.mmMovement, IntraBalanceOrOperationalError4Choice.mmMovements, IntraBalanceOrOperationalError6Choice.mmModifications,
						IntraBalanceOrOperationalError5Choice.mmCancellations, IntraBalanceCancellation3.mmCancellation, IntraBalanceMovement3.mmMovementDetails, IntraBalanceCancellation4.mmUnderlyingIntraBalance,
						IntraBalanceModification4.mmUnderlyingIntraBalance, IntraBalanceMovements2.mmMovement, IntraBalanceModification3.mmModification);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BookEntry.mmCashEntry, com.tools20022.repository.entity.BookEntry.mmDebitEntry, com.tools20022.repository.entity.BookEntry.mmCreditEntry,
						com.tools20022.repository.entity.BookEntry.mmTransferAdvice, com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow,
						com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction);
				derivationComponent_lazy = () -> Arrays.asList(FinancingDateDetails1.mmObject(), IntraBalance2.mmObject(), IntraBalance1.mmObject(), IntraBalanceCancellation2.mmObject(), IntraBalanceCancellation1.mmObject(),
						IntraBalanceOrOperationalError2Choice.mmObject(), IntraBalanceMovement2.mmObject(), IntraBalanceMovement1.mmObject(), IntraBalanceMovements1.mmObject(), IntraBalanceOrOperationalError1Choice.mmObject(),
						IntraBalanceQueryCriteria2.mmObject(), IntraBalancePending2.mmObject(), IntraBalancePending1.mmObject(), IntraBalancePosting2.mmObject(), IntraBalancePosting1.mmObject(), IntraBalanceType1.mmObject(),
						IntraBalanceModification2.mmObject(), IntraBalanceModification1.mmObject(), IntraBalanceOrOperationalError3Choice.mmObject(), IntraBalanceQueryCriteria3.mmObject(), IntraBalance3.mmObject(),
						IntraBalancePending3.mmObject(), IntraBalanceOrOperationalError4Choice.mmObject(), IntraBalanceOrOperationalError6Choice.mmObject(), IntraBalance4.mmObject(), IntraBalanceOrOperationalError5Choice.mmObject(),
						IntraBalancePosting3.mmObject(), IntraBalanceCancellation3.mmObject(), IntraBalanceMovement3.mmObject(), IntraBalanceMovement4.mmObject(), IntraBalanceCancellation4.mmObject(), IntraBalanceModification4.mmObject(),
						IntraBalanceType2.mmObject(), IntraBalancePending4.mmObject(), IntraBalanceMovements2.mmObject(), IntraBalanceQueryCriteria5.mmObject(), IntraBalancePosting4.mmObject(), IntraBalanceQueryCriteria6.mmObject(),
						IntraBalanceModification3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return BookEntry.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashEntry> getCashEntry() {
		return cashEntry == null ? cashEntry = new ArrayList<>() : cashEntry;
	}

	public BookEntry setCashEntry(List<com.tools20022.repository.entity.CashEntry> cashEntry) {
		this.cashEntry = Objects.requireNonNull(cashEntry);
		return this;
	}

	public List<CashEntry> getDebitEntry() {
		return debitEntry == null ? debitEntry = new ArrayList<>() : debitEntry;
	}

	public BookEntry setDebitEntry(List<com.tools20022.repository.entity.CashEntry> debitEntry) {
		this.debitEntry = Objects.requireNonNull(debitEntry);
		return this;
	}

	public List<CashEntry> getCreditEntry() {
		return creditEntry == null ? creditEntry = new ArrayList<>() : creditEntry;
	}

	public BookEntry setCreditEntry(List<com.tools20022.repository.entity.CashEntry> creditEntry) {
		this.creditEntry = Objects.requireNonNull(creditEntry);
		return this;
	}

	public YesNoIndicator getTransferAdvice() {
		return transferAdvice;
	}

	public BookEntry setTransferAdvice(YesNoIndicator transferAdvice) {
		this.transferAdvice = Objects.requireNonNull(transferAdvice);
		return this;
	}

	public FundsCashFlow getFundSubscriptionCashInFlow() {
		return fundSubscriptionCashInFlow;
	}

	public BookEntry setFundSubscriptionCashInFlow(FundsCashFlow fundSubscriptionCashInFlow) {
		this.fundSubscriptionCashInFlow = Objects.requireNonNull(fundSubscriptionCashInFlow);
		return this;
	}

	public FundsCashFlow getFundRedemptionCashOutFlow() {
		return fundRedemptionCashOutFlow;
	}

	public BookEntry setFundRedemptionCashOutFlow(FundsCashFlow fundRedemptionCashOutFlow) {
		this.fundRedemptionCashOutFlow = Objects.requireNonNull(fundRedemptionCashOutFlow);
		return this;
	}

	public CashSettlement getRelatedSettlementInstruction() {
		return relatedSettlementInstruction;
	}

	public BookEntry setRelatedSettlementInstruction(CashSettlement relatedSettlementInstruction) {
		this.relatedSettlementInstruction = Objects.requireNonNull(relatedSettlementInstruction);
		return this;
	}
}