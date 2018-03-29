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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FailureReason8Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction for which the exception is sent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction27#mmTransactionIdentification
 * ATMTransaction27.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction27#mmReconciliationIdentification
 * ATMTransaction27.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction27#mmException
 * ATMTransaction27.mmException}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction27#mmExceptionDetail
 * ATMTransaction27.mmExceptionDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction27#mmElectronicPurseBalance
 * ATMTransaction27.mmElectronicPurseBalance}</li>
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
 * "ATMTransaction27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction for which the exception is sent."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction25 ATMTransaction25}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction27", propOrder = {"transactionIdentification", "reconciliationIdentification", "exception", "exceptionDetail", "electronicPurseBalance"})
public class ATMTransaction27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId")
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction25#mmTransactionIdentification
	 * ATMTransaction25.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction27, Optional<TransactionIdentifier1>> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction27, Optional<TransactionIdentifier1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction.";
			previousVersion_lazy = () -> ATMTransaction25.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public Optional<TransactionIdentifier1> getValue(ATMTransaction27 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction27 obj, Optional<TransactionIdentifier1> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnId")
	protected Max35Text reconciliationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the reconciliation period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction25#mmReconciliationIdentification
	 * ATMTransaction25.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction27, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction27, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period.";
			previousVersion_lazy = () -> ATMTransaction25.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction27 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction27 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Xcptn", required = true)
	protected List<FailureReason8Code> exception;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xcptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exception"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exception occurring outside the service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction27, List<FailureReason8Code>> mmException = new MMMessageAttribute<ATMTransaction27, List<FailureReason8Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "Xcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exception";
			definition = "Exception occurring outside the service.";
			minOccurs = 1;
			simpleType_lazy = () -> FailureReason8Code.mmObject();
		}

		@Override
		public List<FailureReason8Code> getValue(ATMTransaction27 obj) {
			return obj.getException();
		}

		@Override
		public void setValue(ATMTransaction27 obj, List<FailureReason8Code> value) {
			obj.setException(value);
		}
	};
	@XmlElement(name = "XcptnDtl")
	protected List<Max70Text> exceptionDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Explanation of the exception."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction27, List<Max70Text>> mmExceptionDetail = new MMMessageAttribute<ATMTransaction27, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "XcptnDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionDetail";
			definition = "Explanation of the exception.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(ATMTransaction27 obj) {
			return obj.getExceptionDetail();
		}

		@Override
		public void setValue(ATMTransaction27 obj, List<Max70Text> value) {
			obj.setExceptionDetail(value);
		}
	};
	@XmlElement(name = "ElctrncPrsBal")
	protected CurrencyAndAmount electronicPurseBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncPrsBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicPurseBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the captured card or epurse if available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction27, Optional<CurrencyAndAmount>> mmElectronicPurseBalance = new MMMessageAttribute<ATMTransaction27, Optional<CurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "ElctrncPrsBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicPurseBalance";
			definition = "Balance of the captured card or epurse if available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(ATMTransaction27 obj) {
			return obj.getElectronicPurseBalance();
		}

		@Override
		public void setValue(ATMTransaction27 obj, Optional<CurrencyAndAmount> value) {
			obj.setElectronicPurseBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction27.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction27.mmReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction27.mmException, com.tools20022.repository.msg.ATMTransaction27.mmExceptionDetail, com.tools20022.repository.msg.ATMTransaction27.mmElectronicPurseBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction27";
				definition = "Transaction for which the exception is sent.";
				previousVersion_lazy = () -> ATMTransaction25.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionIdentifier1> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public ATMTransaction27 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public ATMTransaction27 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public List<FailureReason8Code> getException() {
		return exception == null ? exception = new ArrayList<>() : exception;
	}

	public ATMTransaction27 setException(List<FailureReason8Code> exception) {
		this.exception = Objects.requireNonNull(exception);
		return this;
	}

	public List<Max70Text> getExceptionDetail() {
		return exceptionDetail == null ? exceptionDetail = new ArrayList<>() : exceptionDetail;
	}

	public ATMTransaction27 setExceptionDetail(List<Max70Text> exceptionDetail) {
		this.exceptionDetail = Objects.requireNonNull(exceptionDetail);
		return this;
	}

	public Optional<CurrencyAndAmount> getElectronicPurseBalance() {
		return electronicPurseBalance == null ? Optional.empty() : Optional.of(electronicPurseBalance);
	}

	public ATMTransaction27 setElectronicPurseBalance(CurrencyAndAmount electronicPurseBalance) {
		this.electronicPurseBalance = electronicPurseBalance;
		return this;
	}
}