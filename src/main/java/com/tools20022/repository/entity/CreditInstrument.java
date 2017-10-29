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
import com.tools20022.repository.codeset.PaymentMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the instrument to be used for the credit of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditInstrument" src="doc-files/CreditInstrument.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#RelatedPayment
 * CreditInstrument.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditInstrument#Method
 * CreditInstrument.Method}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#CreditInstrumentIdentification
 * CreditInstrument.CreditInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditInstrument#NetAmount
 * CreditInstrument.NetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditInstrument#Deadline
 * CreditInstrument.Deadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CreditMethod
 * Payment.CreditMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountEntry AccountEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDelivery CashDelivery}</li>
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
 * "CreditInstrument"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the instrument to be used for the credit of a payment."</li>
 * </ul>
 */
public class CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment which uses the credit instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#CreditMethod
	 * Payment.CreditMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which uses the credit instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CreditInstrument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses the credit instrument.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.CreditMethod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transfer method to be used for the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethodCode
	 * PaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#PaymentMethod
	 * PaymentInstruction1.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#PaymentMethod
	 * PaymentInstruction6.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#PaymentMethod
	 * PaymentInstruction9.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#PaymentMethod
	 * PaymentInstruction7.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#PaymentMethod
	 * PaymentInstruction10.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#PaymentMethod
	 * OriginalTransactionReference1.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#PaymentMethod
	 * OriginalTransactionReference13.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#PaymentMethod
	 * OriginalTransactionReference16.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#PaymentMethod
	 * OriginalTransactionReference15.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#PaymentMethod
	 * OriginalTransactionReference17.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#PaymentMethod
	 * PaymentInstruction5.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#PaymentMethod
	 * PaymentInstruction8.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#PaymentMethod
	 * PaymentInstruction11.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInformation15#PaymentMethod
	 * PaymentInformation15.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#PaymentMethodCode
	 * PaymentMeans1.PaymentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#PaymentMethod
	 * OriginalTransactionReference9.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#PaymentMethod
	 * OriginalTransactionReference12.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#PaymentMethod
	 * PaymentInstruction14.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#PaymentMethod
	 * PaymentInstruction16.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#PaymentMethod
	 * PaymentInstruction15.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#PaymentMethod
	 * OriginalTransactionReference20.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#PaymentMethod
	 * PaymentInstruction17.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#PaymentMethod
	 * PaymentInstruction18.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#PaymentMethod
	 * PaymentInstruction19.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#PaymentMethod
	 * PaymentInstruction20.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#PaymentMethod
	 * OriginalTransactionReference22.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#PaymentMethod
	 * PaymentInstruction21.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#PaymentMethod
	 * PaymentInstruction23.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PaymentMethod
	 * PaymentInstruction22.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#PaymentMethod
	 * OriginalTransactionReference24.PaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer method to be used for the transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction1.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction6.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction9.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction7.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction10.PaymentMethod,
					com.tools20022.repository.msg.OriginalTransactionReference1.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference13.PaymentMethod,
					com.tools20022.repository.msg.OriginalTransactionReference16.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference15.PaymentMethod,
					com.tools20022.repository.msg.OriginalTransactionReference17.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction5.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction8.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction11.PaymentMethod, com.tools20022.repository.msg.PaymentInformation15.PaymentMethod, com.tools20022.repository.msg.PaymentMeans1.PaymentMethodCode,
					com.tools20022.repository.msg.OriginalTransactionReference9.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference12.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction14.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction16.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction15.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference20.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction17.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction18.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction19.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction20.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference22.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction21.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstruction23.PaymentMethod, com.tools20022.repository.msg.PaymentInstruction22.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference24.PaymentMethod);
			elementContext_lazy = () -> CreditInstrument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Transfer method to be used for the transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentMethodCode.mmObject();
		}
	};
	/**
	 * Identifies the credit instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#ChequeNumber
	 * Cheque5.ChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque6#ChequeNumber
	 * Cheque6.ChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#ChequeNumber
	 * Cheque7.ChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque3#Number
	 * Cheque3.Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#Number
	 * Cheque9.Number}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the credit instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditInstrumentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque5.ChequeNumber, com.tools20022.repository.msg.Cheque6.ChequeNumber, com.tools20022.repository.msg.Cheque7.ChequeNumber,
					com.tools20022.repository.msg.Cheque3.Number, com.tools20022.repository.msg.Cheque9.Number);
			elementContext_lazy = () -> CreditInstrument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditInstrumentIdentification";
			definition = "Identifies the credit instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Amount less fees and charges, that will be exchanged on settlement date
	 * of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#TransferredAmount
	 * LiquidityCreditTransfer1.TransferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#TransferredAmount
	 * LiquidityDebitTransfer1.TransferredAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount less fees and charges, that will be exchanged on settlement date of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityCreditTransfer1.TransferredAmount, com.tools20022.repository.msg.LiquidityDebitTransfer1.TransferredAmount);
			elementContext_lazy = () -> CreditInstrument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount less fees and charges, that will be exchanged on settlement date of the trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Time by which the amount must be paid in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time by which the amount must be paid in."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Deadline = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CreditInstrument.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Time by which the amount must be paid in.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditInstrument";
				definition = "Specifies the instrument to be used for the credit of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.CreditMethod);
				subType_lazy = () -> Arrays.asList(ChequeIssue.mmObject(), BookEntry.mmObject(), AccountEntry.mmObject(), CashDelivery.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditInstrument.RelatedPayment, com.tools20022.repository.entity.CreditInstrument.Method,
						com.tools20022.repository.entity.CreditInstrument.CreditInstrumentIdentification, com.tools20022.repository.entity.CreditInstrument.NetAmount, com.tools20022.repository.entity.CreditInstrument.Deadline);
			}
		});
		return mmObject_lazy.get();
	}
}