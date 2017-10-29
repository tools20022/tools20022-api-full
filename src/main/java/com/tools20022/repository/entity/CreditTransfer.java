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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#StandingOrder
 * CreditTransfer.StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#RelatedStandingOrder
 * CreditTransfer.RelatedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CreditTransfer
 * CashStandingOrder.CreditTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#CreditTransferTransactionInformation
 * PaymentInstructionInformation1.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#CreditTransferTransactionInformation
 * PaymentInstructionInformation3.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#CreditTransferTransactionInformation
 * PaymentInstruction6.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#CreditTransferTransactionInformation
 * PaymentInstruction9.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#UnderlyingCustomerCreditTransfer
 * CreditTransferTransactionInformation13.UnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#UnderlyingCustomerCreditTransfer
 * CreditTransferTransaction4.UnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#UnderlyingCustomerCreditTransfer
 * CreditTransferTransaction8.UnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#CreditTransferTransaction
 * PaymentInstruction5.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#CreditTransferTransaction
 * PaymentInstruction8.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#CreditTransferTransaction
 * PaymentInstruction11.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice#CreditTransferDetails
 * PaymentInstrument7Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice#CreditTransferDetails
 * PaymentInstrument11Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#CreditTransferDetails
 * PaymentInstrument9Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#CreditTransferDetails
 * PaymentInstrument10Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#CreditTransferDetails
 * PaymentInstrument6Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#CreditTransferDetails
 * PaymentInstrument8Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice#CreditTransferDetails
 * PaymentInstrument12Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument13Choice#CreditTransferDetails
 * PaymentInstrument13Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice#CreditTransferDetails
 * PaymentInstrument14Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#CreditTransferTransactionInformation
 * PaymentInstruction16.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#UnderlyingCustomerCreditTransfer
 * CreditTransferTransaction17.UnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#CreditTransferTransaction
 * PaymentInstruction17.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#UnderlyingCustomerCreditTransfer
 * CreditTransferTransaction23.UnderlyingCustomerCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#CreditTransferTransaction
 * PaymentInstruction19.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#CreditTransferTransactionInformation
 * PaymentInstruction20.CreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice#CreditTransferDetails
 * PaymentInstrument21Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice#CreditTransferDetails
 * PaymentInstrument20Choice.CreditTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#CreditTransferTransaction
 * PaymentInstruction23.CreditTransferTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#CreditTransferTransactionInformation
 * PaymentInstruction22.CreditTransferTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
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
 * "CreditTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems."
 * </li>
 * </ul>
 */
public class CreditTransfer extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a standing order. This information is derived from the
	 * presence of detailed standing order specification.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a standing order. This information is derived from the presence of detailed standing order specification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandingOrder = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CreditTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order. This information is derived from the presence of detailed standing order specification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Standing order which creates the credit transfers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#CreditTransfer
	 * CashStandingOrder.CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which creates the credit transfers."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CreditTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order which creates the credit transfers.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashStandingOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.CreditTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer";
				definition = "Payment made by transferring an amount of money from a debtor to a creditor. The payment flows through one or more financial institutions or systems.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashStandingOrder.CreditTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionInformation1.CreditTransferTransactionInformation,
						com.tools20022.repository.msg.PaymentInstructionInformation3.CreditTransferTransactionInformation, com.tools20022.repository.msg.PaymentInstruction6.CreditTransferTransactionInformation,
						com.tools20022.repository.msg.PaymentInstruction9.CreditTransferTransactionInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation13.UnderlyingCustomerCreditTransfer,
						com.tools20022.repository.msg.CreditTransferTransaction4.UnderlyingCustomerCreditTransfer, com.tools20022.repository.msg.CreditTransferTransaction8.UnderlyingCustomerCreditTransfer,
						com.tools20022.repository.msg.PaymentInstruction5.CreditTransferTransaction, com.tools20022.repository.msg.PaymentInstruction8.CreditTransferTransaction,
						com.tools20022.repository.msg.PaymentInstruction11.CreditTransferTransaction, com.tools20022.repository.choice.PaymentInstrument7Choice.CreditTransferDetails,
						com.tools20022.repository.choice.PaymentInstrument11Choice.CreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument9Choice.CreditTransferDetails,
						com.tools20022.repository.choice.PaymentInstrument10Choice.CreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument6Choice.CreditTransferDetails,
						com.tools20022.repository.choice.PaymentInstrument8Choice.CreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument12Choice.CreditTransferDetails,
						com.tools20022.repository.choice.PaymentInstrument13Choice.CreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument14Choice.CreditTransferDetails,
						com.tools20022.repository.msg.PaymentInstruction16.CreditTransferTransactionInformation, com.tools20022.repository.msg.CreditTransferTransaction17.UnderlyingCustomerCreditTransfer,
						com.tools20022.repository.msg.PaymentInstruction17.CreditTransferTransaction, com.tools20022.repository.msg.CreditTransferTransaction23.UnderlyingCustomerCreditTransfer,
						com.tools20022.repository.msg.PaymentInstruction19.CreditTransferTransaction, com.tools20022.repository.msg.PaymentInstruction20.CreditTransferTransactionInformation,
						com.tools20022.repository.choice.PaymentInstrument21Choice.CreditTransferDetails, com.tools20022.repository.choice.PaymentInstrument20Choice.CreditTransferDetails,
						com.tools20022.repository.msg.PaymentInstruction23.CreditTransferTransaction, com.tools20022.repository.msg.PaymentInstruction22.CreditTransferTransactionInformation);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditTransfer.StandingOrder, com.tools20022.repository.entity.CreditTransfer.RelatedStandingOrder);
				derivationComponent_lazy = () -> Arrays.asList(CreditTransferTransactionInformation1.mmObject(), CreditTransferTransactionInformation10.mmObject(), CreditTransferTransaction1.mmObject(),
						CreditTransferTransaction6.mmObject(), CreditTransferTransactionInformation2.mmObject(), CreditTransferTransactionInformation11.mmObject(), CreditTransferTransaction2.mmObject(),
						CreditTransferTransaction7.mmObject(), CreditTransferTransactionInformation3.mmObject(), CreditTransferTransactionInformation12.mmObject(), CreditTransferTransactionInformation13.mmObject(),
						CreditTransferTransaction3.mmObject(), CreditTransferTransaction4.mmObject(), CreditTransferTransaction8.mmObject(), CreditTransferTransactionInformation14.mmObject(), CreditTransferTransaction5.mmObject(),
						CreditTransferTransaction10.mmObject(), CreditTransfer3.mmObject(), CreditTransfer4.mmObject(), CreditTransfer6.mmObject(), CreditTransferTransactionInformation6.mmObject(),
						CreditTransferTransactionInformation8.mmObject(), CreditTransferTransactionInformation7.mmObject(), CreditTransferTransactionInformation9.mmObject(), CreditTransfer7.mmObject(),
						CreditTransferTransaction17.mmObject(), CreditTransferTransaction19.mmObject(), CreditTransferTransaction18.mmObject(), CreditTransferTransaction20.mmObject(), CreditTransferTransaction21.mmObject(),
						CreditTransferTransaction23.mmObject(), CreditTransferTransaction25.mmObject(), CreditTransferTransaction24.mmObject(), CreditTransferTransaction26.mmObject(), CreditTransferTransaction22.mmObject(),
						CreditTransfer8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}