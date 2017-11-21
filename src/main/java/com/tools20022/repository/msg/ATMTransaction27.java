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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransaction27", propOrder = {"transactionIdentification", "reconciliationIdentification", "exception", "exceptionDetail", "electronicPurseBalance"})
public class ATMTransaction27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Identification of the transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction.";
			previousVersion_lazy = () -> ATMTransaction25.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
	/**
	 * Identification of the reconciliation period.
	 * <p>
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
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction27.mmObject();
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
	};
	protected List<FailureReason8Code> exception;
	/**
	 * Exception occurring outside the service.
	 * <p>
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
	public static final MMMessageAttribute mmException = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "Xcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exception";
			definition = "Exception occurring outside the service.";
			minOccurs = 1;
			simpleType_lazy = () -> FailureReason8Code.mmObject();
		}
	};
	protected List<Max70Text> exceptionDetail;
	/**
	 * Explanation of the exception.
	 * <p>
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
	public static final MMMessageAttribute mmExceptionDetail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "XcptnDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionDetail";
			definition = "Explanation of the exception.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CurrencyAndAmount electronicPurseBalance;
	/**
	 * Balance of the captured card or epurse if available.
	 * <p>
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
	public static final MMMessageAttribute mmElectronicPurseBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction27.mmObject();
			isDerived = false;
			xmlTag = "ElctrncPrsBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicPurseBalance";
			definition = "Balance of the captured card or epurse if available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTransaction27.mmTransactionIdentification, ATMTransaction27.mmReconciliationIdentification, ATMTransaction27.mmException, ATMTransaction27.mmExceptionDetail,
						ATMTransaction27.mmElectronicPurseBalance);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction27";
				definition = "Transaction for which the exception is sent.";
				previousVersion_lazy = () -> ATMTransaction25.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId")
	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "RcncltnId")
	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	@XmlElement(name = "Xcptn", required = true)
	public List<FailureReason8Code> getException() {
		return exception;
	}

	public void setException(List<FailureReason8Code> exception) {
		this.exception = exception;
	}

	@XmlElement(name = "XcptnDtl")
	public List<Max70Text> getExceptionDetail() {
		return exceptionDetail;
	}

	public void setExceptionDetail(List<Max70Text> exceptionDetail) {
		this.exceptionDetail = exceptionDetail;
	}

	@XmlElement(name = "ElctrncPrsBal")
	public CurrencyAndAmount getElectronicPurseBalance() {
		return electronicPurseBalance;
	}

	public void setElectronicPurseBalance(CurrencyAndAmount electronicPurseBalance) {
		this.electronicPurseBalance = electronicPurseBalance;
	}
}