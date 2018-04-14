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
import com.tools20022.repository.entity.CashStandingOrder;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Payment made by transferring an amount of money from a debtor to a creditor.
 * The payment flows through one or more financial institutions or systems.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditTransfer" src="doc-files/CreditTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmStandingOrder
 * CreditTransfer.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmRelatedStandingOrder
 * CreditTransfer.mmRelatedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditTransfer
 * CashStandingOrder.mmCreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmCreditTransferTransactionInformation
 * PaymentInstructionInformation1.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmCreditTransferTransactionInformation
 * PaymentInstructionInformation3.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmCreditTransferTransactionInformation
 * PaymentInstruction6.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmCreditTransferTransactionInformation
 * PaymentInstruction9.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransactionInformation13.mmUnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction4.mmUnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction8.mmUnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmCreditTransferTransaction
 * PaymentInstruction5.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmCreditTransferTransaction
 * PaymentInstruction8.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmCreditTransferTransaction
 * PaymentInstruction11.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice#mmCreditTransferDetails
 * PaymentInstrument7Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#mmCreditTransferDetails
 * PaymentInstrument11Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#mmCreditTransferDetails
 * PaymentInstrument9Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#mmCreditTransferDetails
 * PaymentInstrument10Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#mmCreditTransferDetails
 * PaymentInstrument6Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#mmCreditTransferDetails
 * PaymentInstrument8Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#mmCreditTransferDetails
 * PaymentInstrument12Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument13Choice#mmCreditTransferDetails
 * PaymentInstrument13Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#mmCreditTransferDetails
 * PaymentInstrument14Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmCreditTransferTransactionInformation
 * PaymentInstruction16.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction17.mmUnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmCreditTransferTransaction
 * PaymentInstruction17.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction23.mmUnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmCreditTransferTransaction
 * PaymentInstruction19.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmCreditTransferTransactionInformation
 * PaymentInstruction20.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#mmCreditTransferDetails
 * PaymentInstrument21Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#mmCreditTransferDetails
 * PaymentInstrument20Choice.mmCreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmCreditTransferTransaction
 * PaymentInstruction23.mmCreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmCreditTransferTransactionInformation
 * PaymentInstruction22.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction24#mmCreditTransferTransactionInformation
 * PaymentInstruction24.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferMethod
 * BalanceTransfer1.mmBalanceTransferMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmReturnChain
 * PaymentTransaction87.mmReturnChain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmUnderlyingCustomerCreditTransfer
 * CreditTransferTransaction31.mmUnderlyingCustomerCreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
 * CreditTransferTransactionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10
 * CreditTransferTransactionInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction1
 * CreditTransferTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction6
 * CreditTransferTransaction6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2
 * CreditTransferTransactionInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11
 * CreditTransferTransactionInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction2
 * CreditTransferTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
 * CreditTransferTransaction7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3
 * CreditTransferTransactionInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
 * CreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13
 * CreditTransferTransactionInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction3
 * CreditTransferTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction4
 * CreditTransferTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction8
 * CreditTransferTransaction8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
 * CreditTransferTransactionInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction5
 * CreditTransferTransaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
 * CreditTransferTransaction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer3
 * CreditTransfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer4
 * CreditTransfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer6
 * CreditTransfer6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6
 * CreditTransferTransactionInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8
 * CreditTransferTransactionInformation8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7
 * CreditTransferTransactionInformation7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
 * CreditTransferTransactionInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer7
 * CreditTransfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction17
 * CreditTransferTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction19
 * CreditTransferTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction18
 * CreditTransferTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction20
 * CreditTransferTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction21
 * CreditTransferTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
 * CreditTransferTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction25
 * CreditTransferTransaction25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction24
 * CreditTransferTransaction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction26
 * CreditTransferTransaction26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
 * CreditTransferTransaction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8
 * CreditTransfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction27
 * CreditTransferTransaction27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction31
 * CreditTransferTransaction31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionParties5
 * TransactionParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction32
 * CreditTransferTransaction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction30
 * CreditTransferTransaction30}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CreditTransfer extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator standingOrder;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a standing order. This information is derived from the presence of detailed standing order specification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CreditTransfer, YesNoIndicator> mmStandingOrder = new MMBusinessAttribute<CreditTransfer, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order. This information is derived from the presence of detailed standing order specification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CreditTransfer obj) {
			return obj.getStandingOrder();
		}

		@Override
		public void setValue(CreditTransfer obj, YesNoIndicator value) {
			obj.setStandingOrder(value);
		}
	};
	protected CashStandingOrder relatedStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditTransfer
	 * CashStandingOrder.mmCreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which creates the credit transfers."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CreditTransfer, Optional<CashStandingOrder>> mmRelatedStandingOrder = new MMBusinessAssociationEnd<CreditTransfer, Optional<CashStandingOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order which creates the credit transfers.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashStandingOrder.mmCreditTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashStandingOrder.mmObject();
		}

		@Override
		public Optional<CashStandingOrder> getValue(CreditTransfer obj) {
			return obj.getRelatedStandingOrder();
		}

		@Override
		public void setValue(CreditTransfer obj, Optional<CashStandingOrder> value) {
			obj.setRelatedStandingOrder(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer";
				definition = "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems.";
				associationDomain_lazy = () -> Arrays.asList(CashStandingOrder.mmCreditTransfer);
				derivationElement_lazy = () -> Arrays.asList(PaymentInstructionInformation1.mmCreditTransferTransactionInformation, PaymentInstructionInformation3.mmCreditTransferTransactionInformation,
						PaymentInstruction6.mmCreditTransferTransactionInformation, PaymentInstruction9.mmCreditTransferTransactionInformation, CreditTransferTransactionInformation13.mmUnderlyingCustomerCreditTransfer,
						CreditTransferTransaction4.mmUnderlyingCustomerCreditTransfer, CreditTransferTransaction8.mmUnderlyingCustomerCreditTransfer, PaymentInstruction5.mmCreditTransferTransaction,
						PaymentInstruction8.mmCreditTransferTransaction, PaymentInstruction11.mmCreditTransferTransaction, PaymentInstrument7Choice.mmCreditTransferDetails, PaymentInstrument11Choice.mmCreditTransferDetails,
						PaymentInstrument9Choice.mmCreditTransferDetails, PaymentInstrument10Choice.mmCreditTransferDetails, PaymentInstrument6Choice.mmCreditTransferDetails, PaymentInstrument8Choice.mmCreditTransferDetails,
						PaymentInstrument12Choice.mmCreditTransferDetails, PaymentInstrument13Choice.mmCreditTransferDetails, PaymentInstrument14Choice.mmCreditTransferDetails, PaymentInstruction16.mmCreditTransferTransactionInformation,
						CreditTransferTransaction17.mmUnderlyingCustomerCreditTransfer, PaymentInstruction17.mmCreditTransferTransaction, CreditTransferTransaction23.mmUnderlyingCustomerCreditTransfer,
						PaymentInstruction19.mmCreditTransferTransaction, PaymentInstruction20.mmCreditTransferTransactionInformation, PaymentInstrument21Choice.mmCreditTransferDetails, PaymentInstrument20Choice.mmCreditTransferDetails,
						PaymentInstruction23.mmCreditTransferTransaction, PaymentInstruction22.mmCreditTransferTransactionInformation, PaymentInstruction24.mmCreditTransferTransactionInformation, BalanceTransfer1.mmBalanceTransferMethod,
						PaymentTransaction87.mmReturnChain, CreditTransferTransaction31.mmUnderlyingCustomerCreditTransfer);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditTransfer.mmStandingOrder, com.tools20022.repository.entity.CreditTransfer.mmRelatedStandingOrder);
				derivationComponent_lazy = () -> Arrays.asList(CreditTransferTransactionInformation1.mmObject(), CreditTransferTransactionInformation10.mmObject(), CreditTransferTransaction1.mmObject(),
						CreditTransferTransaction6.mmObject(), CreditTransferTransactionInformation2.mmObject(), CreditTransferTransactionInformation11.mmObject(), CreditTransferTransaction2.mmObject(),
						CreditTransferTransaction7.mmObject(), CreditTransferTransactionInformation3.mmObject(), CreditTransferTransactionInformation12.mmObject(), CreditTransferTransactionInformation13.mmObject(),
						CreditTransferTransaction3.mmObject(), CreditTransferTransaction4.mmObject(), CreditTransferTransaction8.mmObject(), CreditTransferTransactionInformation14.mmObject(), CreditTransferTransaction5.mmObject(),
						CreditTransferTransaction10.mmObject(), CreditTransfer3.mmObject(), CreditTransfer4.mmObject(), CreditTransfer6.mmObject(), CreditTransferTransactionInformation6.mmObject(),
						CreditTransferTransactionInformation8.mmObject(), CreditTransferTransactionInformation7.mmObject(), CreditTransferTransactionInformation9.mmObject(), CreditTransfer7.mmObject(),
						CreditTransferTransaction17.mmObject(), CreditTransferTransaction19.mmObject(), CreditTransferTransaction18.mmObject(), CreditTransferTransaction20.mmObject(), CreditTransferTransaction21.mmObject(),
						CreditTransferTransaction23.mmObject(), CreditTransferTransaction25.mmObject(), CreditTransferTransaction24.mmObject(), CreditTransferTransaction26.mmObject(), CreditTransferTransaction22.mmObject(),
						CreditTransfer8.mmObject(), CreditTransferTransaction27.mmObject(), CreditTransferTransaction31.mmObject(), TransactionParties5.mmObject(), CreditTransferTransaction32.mmObject(),
						CreditTransferTransaction30.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getStandingOrder() {
		return standingOrder;
	}

	public CreditTransfer setStandingOrder(YesNoIndicator standingOrder) {
		this.standingOrder = Objects.requireNonNull(standingOrder);
		return this;
	}

	public Optional<CashStandingOrder> getRelatedStandingOrder() {
		return relatedStandingOrder == null ? Optional.empty() : Optional.of(relatedStandingOrder);
	}

	public CreditTransfer setRelatedStandingOrder(CashStandingOrder relatedStandingOrder) {
		this.relatedStandingOrder = relatedStandingOrder;
		return this;
	}
}