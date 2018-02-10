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
import com.tools20022.repository.codeset.PaymentMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
 * CreditInstrument.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
 * CreditInstrument.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmCreditInstrumentIdentification
 * CreditInstrument.mmCreditInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmNetAmount
 * CreditInstrument.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditInstrument#mmDeadline
 * CreditInstrument.mmDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
 * Payment.mmCreditMethod}</li>
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
	protected List<com.tools20022.repository.entity.Payment> relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
	 * Payment.mmCreditMethod}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses the credit instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmCreditMethod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected PaymentMethodCode method;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPaymentMethod
	 * PaymentInstruction1.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmPaymentMethod
	 * PaymentInstruction6.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentMethod
	 * PaymentInstruction9.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmPaymentMethod
	 * PaymentInstruction7.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentMethod
	 * PaymentInstruction10.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmPaymentMethod
	 * OriginalTransactionReference1.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmPaymentMethod
	 * OriginalTransactionReference13.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmPaymentMethod
	 * OriginalTransactionReference16.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmPaymentMethod
	 * OriginalTransactionReference15.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmPaymentMethod
	 * OriginalTransactionReference17.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmPaymentMethod
	 * PaymentInstruction5.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmPaymentMethod
	 * PaymentInstruction8.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentMethod
	 * PaymentInstruction11.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInformation15#mmPaymentMethod
	 * PaymentInformation15.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentMeans1#mmPaymentMethodCode
	 * PaymentMeans1.mmPaymentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmPaymentMethod
	 * OriginalTransactionReference9.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmPaymentMethod
	 * OriginalTransactionReference12.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPaymentMethod
	 * PaymentInstruction14.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentMethod
	 * PaymentInstruction16.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentMethod
	 * PaymentInstruction15.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmPaymentMethod
	 * OriginalTransactionReference20.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentMethod
	 * PaymentInstruction17.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentMethod
	 * PaymentInstruction18.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentMethod
	 * PaymentInstruction19.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentMethod
	 * PaymentInstruction20.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmPaymentMethod
	 * OriginalTransactionReference22.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentMethod
	 * PaymentInstruction21.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentMethod
	 * PaymentInstruction23.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentMethod
	 * PaymentInstruction22.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmPaymentMethod
	 * OriginalTransactionReference24.mmPaymentMethod}</li>
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
	public static final MMBusinessAttribute mmMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstruction1.mmPaymentMethod, PaymentInstruction6.mmPaymentMethod, PaymentInstruction9.mmPaymentMethod, PaymentInstruction7.mmPaymentMethod, PaymentInstruction10.mmPaymentMethod,
					OriginalTransactionReference1.mmPaymentMethod, OriginalTransactionReference13.mmPaymentMethod, OriginalTransactionReference16.mmPaymentMethod, OriginalTransactionReference15.mmPaymentMethod,
					OriginalTransactionReference17.mmPaymentMethod, PaymentInstruction5.mmPaymentMethod, PaymentInstruction8.mmPaymentMethod, PaymentInstruction11.mmPaymentMethod, PaymentInformation15.mmPaymentMethod,
					PaymentMeans1.mmPaymentMethodCode, OriginalTransactionReference9.mmPaymentMethod, OriginalTransactionReference12.mmPaymentMethod, PaymentInstruction14.mmPaymentMethod, PaymentInstruction16.mmPaymentMethod,
					PaymentInstruction15.mmPaymentMethod, OriginalTransactionReference20.mmPaymentMethod, PaymentInstruction17.mmPaymentMethod, PaymentInstruction18.mmPaymentMethod, PaymentInstruction19.mmPaymentMethod,
					PaymentInstruction20.mmPaymentMethod, OriginalTransactionReference22.mmPaymentMethod, PaymentInstruction21.mmPaymentMethod, PaymentInstruction23.mmPaymentMethod, PaymentInstruction22.mmPaymentMethod,
					OriginalTransactionReference24.mmPaymentMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Transfer method to be used for the transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreditInstrument.class.getMethod("getMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text creditInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque5#mmChequeNumber
	 * Cheque5.mmChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque6#mmChequeNumber
	 * Cheque6.mmChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque7#mmChequeNumber
	 * Cheque7.mmChequeNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque3#mmNumber
	 * Cheque3.mmNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cheque9#mmNumber
	 * Cheque9.mmNumber}</li>
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
	public static final MMBusinessAttribute mmCreditInstrumentIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Cheque5.mmChequeNumber, Cheque6.mmChequeNumber, Cheque7.mmChequeNumber, Cheque3.mmNumber, Cheque9.mmNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditInstrumentIdentification";
			definition = "Identifies the credit instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreditInstrument.class.getMethod("getCreditInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1#mmTransferredAmount
	 * LiquidityCreditTransfer1.mmTransferredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1#mmTransferredAmount
	 * LiquidityDebitTransfer1.mmTransferredAmount}</li>
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
	public static final MMBusinessAttribute mmNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LiquidityCreditTransfer1.mmTransferredAmount, LiquidityDebitTransfer1.mmTransferredAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount less fees and charges, that will be exchanged on settlement date of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreditInstrument.class.getMethod("getNetAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime deadline;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmDeadline = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Time by which the amount must be paid in.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreditInstrument.class.getMethod("getDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditInstrument";
				definition = "Specifies the instrument to be used for the credit of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmCreditMethod);
				subType_lazy = () -> Arrays.asList(ChequeIssue.mmObject(), BookEntry.mmObject(), AccountEntry.mmObject(), CashDelivery.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditInstrument.mmRelatedPayment, com.tools20022.repository.entity.CreditInstrument.mmMethod,
						com.tools20022.repository.entity.CreditInstrument.mmCreditInstrumentIdentification, com.tools20022.repository.entity.CreditInstrument.mmNetAmount, com.tools20022.repository.entity.CreditInstrument.mmDeadline);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditInstrument.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Payment> getRelatedPayment() {
		return relatedPayment == null ? relatedPayment = new ArrayList<>() : relatedPayment;
	}

	public CreditInstrument setRelatedPayment(List<com.tools20022.repository.entity.Payment> relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public PaymentMethodCode getMethod() {
		return method;
	}

	public CreditInstrument setMethod(PaymentMethodCode method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public Max35Text getCreditInstrumentIdentification() {
		return creditInstrumentIdentification;
	}

	public CreditInstrument setCreditInstrumentIdentification(Max35Text creditInstrumentIdentification) {
		this.creditInstrumentIdentification = Objects.requireNonNull(creditInstrumentIdentification);
		return this;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public CreditInstrument setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public ISODateTime getDeadline() {
		return deadline;
	}

	public CreditInstrument setDeadline(ISODateTime deadline) {
		this.deadline = Objects.requireNonNull(deadline);
		return this;
	}
}