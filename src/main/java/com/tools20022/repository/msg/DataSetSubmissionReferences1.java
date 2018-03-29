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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides references to the submitted data set both for the TSU and for the
 * user. Also specifies whether the submission is the last one for the
 * underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1#mmTransactionIdentification
 * DataSetSubmissionReferences1.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1#mmSubmitterTransactionReference
 * DataSetSubmissionReferences1.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1#mmFinalSubmission
 * DataSetSubmissionReferences1.mmFinalSubmission}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetSubmissionReferences1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides references to the submitted data set both for the TSU and for the user. Also specifies whether the submission is the last one for the underlying transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DataSetSubmissionReferences1", propOrder = {"transactionIdentification", "submitterTransactionReference", "finalSubmission"})
public class DataSetSubmissionReferences1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1
	 * DataSetSubmissionReferences1}</li>
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
	 * definition} =
	 * "Unique identification assigned by the TSU to the transaction.\nThis identification is to be used in any communication between the parties and with the TSU."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetSubmissionReferences1, Max35Text> mmTransactionIdentification = new MMMessageAttribute<DataSetSubmissionReferences1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetSubmissionReferences1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the TSU to the transaction.\nThis identification is to be used in any communication between the parties and with the TSU.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DataSetSubmissionReferences1 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(DataSetSubmissionReferences1 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SubmitrTxRef", required = true)
	protected DocumentIdentification5 submitterTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1
	 * DataSetSubmissionReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the financial institution that submits the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DataSetSubmissionReferences1, DocumentIdentification5> mmSubmitterTransactionReference = new MMMessageAssociationEnd<DataSetSubmissionReferences1, DocumentIdentification5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetSubmissionReferences1.mmObject();
			isDerived = false;
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the financial institution that submits the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification5.mmObject();
		}

		@Override
		public DocumentIdentification5 getValue(DataSetSubmissionReferences1 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(DataSetSubmissionReferences1 obj, DocumentIdentification5 value) {
			obj.setSubmitterTransactionReference(value);
		}
	};
	@XmlElement(name = "FnlSubmissn", required = true)
	protected YesNoIndicator finalSubmission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences1
	 * DataSetSubmissionReferences1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSubmissn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the current submission of data sets is the last submission for the transaction identified by the TSU transaction identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetSubmissionReferences1, YesNoIndicator> mmFinalSubmission = new MMMessageAttribute<DataSetSubmissionReferences1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetSubmissionReferences1.mmObject();
			isDerived = false;
			xmlTag = "FnlSubmissn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSubmission";
			definition = "Specifies whether the current submission of data sets is the last submission for the transaction identified by the TSU transaction identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(DataSetSubmissionReferences1 obj) {
			return obj.getFinalSubmission();
		}

		@Override
		public void setValue(DataSetSubmissionReferences1 obj, YesNoIndicator value) {
			obj.setFinalSubmission(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DataSetSubmissionReferences1.mmTransactionIdentification, com.tools20022.repository.msg.DataSetSubmissionReferences1.mmSubmitterTransactionReference,
						com.tools20022.repository.msg.DataSetSubmissionReferences1.mmFinalSubmission);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DataSetSubmissionReferences1";
				definition = "Provides references to the submitted data set both for the TSU and for the user. Also specifies whether the submission is the last one for the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public DataSetSubmissionReferences1 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public DocumentIdentification5 getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public DataSetSubmissionReferences1 setSubmitterTransactionReference(DocumentIdentification5 submitterTransactionReference) {
		this.submitterTransactionReference = Objects.requireNonNull(submitterTransactionReference);
		return this;
	}

	public YesNoIndicator getFinalSubmission() {
		return finalSubmission;
	}

	public DataSetSubmissionReferences1 setFinalSubmission(YesNoIndicator finalSubmission) {
		this.finalSubmission = Objects.requireNonNull(finalSubmission);
		return this;
	}
}