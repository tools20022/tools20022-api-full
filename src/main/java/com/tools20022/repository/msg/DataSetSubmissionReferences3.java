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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV03;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV04;
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides references to the submitted data set both for the matching
 * application and for the user.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3#mmTransactionIdentification
 * DataSetSubmissionReferences3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3#mmPurchaseOrderReference
 * DataSetSubmissionReferences3.mmPurchaseOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3#mmSubmitterTransactionReference
 * DataSetSubmissionReferences3.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3#mmForcedMatch
 * DataSetSubmissionReferences3.mmForcedMatch}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmRelatedTransactionReferences
 * DataSetSubmissionV03.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmRelatedTransactionReferences
 * DataSetSubmissionV04.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmRelatedTransactionReferences
 * DataSetSubmissionV05.mmRelatedTransactionReferences}</li>
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
 * "DataSetSubmissionReferences3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides references to the submitted data set both for the matching application and for the user."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DataSetSubmissionReferences3", propOrder = {"transactionIdentification", "purchaseOrderReference", "submitterTransactionReference", "forcedMatch"})
public class DataSetSubmissionReferences3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
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
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DataSetSubmissionReferences3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * Reference to the purchase order of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the purchase order of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurchaseOrderReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DataSetSubmissionReferences3.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected Max35Text submitterTransactionReference;
	/**
	 * Provides reference to the transaction for the financial institution that
	 * submits the data set.
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
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
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
	 * "Provides reference to the transaction for the financial institution that submits the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubmitterTransactionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DataSetSubmissionReferences3.mmObject();
			isDerived = false;
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Provides reference to the transaction for the financial institution that submits the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator forcedMatch;
	/**
	 * Specifies that this message should force the matching application to
	 * match all data sets it has received so far for the transaction identified
	 * by the transaction identification.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForcdMtch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForcedMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that this message should force the matching application to match all data sets it has received so far for the transaction identified by the transaction identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForcedMatch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DataSetSubmissionReferences3.mmObject();
			isDerived = false;
			xmlTag = "ForcdMtch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedMatch";
			definition = "Specifies that this message should force the matching application to match all data sets it has received so far for the transaction identified by the transaction identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DataSetSubmissionReferences3.mmTransactionIdentification, DataSetSubmissionReferences3.mmPurchaseOrderReference, DataSetSubmissionReferences3.mmSubmitterTransactionReference,
						DataSetSubmissionReferences3.mmForcedMatch);
				messageBuildingBlock_lazy = () -> Arrays.asList(DataSetSubmissionV03.mmRelatedTransactionReferences, DataSetSubmissionV04.mmRelatedTransactionReferences, DataSetSubmissionV05.mmRelatedTransactionReferences);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetSubmissionReferences3";
				definition = "Provides references to the submitted data set both for the matching application and for the user.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "PurchsOrdrRef", required = true)
	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	@XmlElement(name = "SubmitrTxRef")
	public Max35Text getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public void setSubmitterTransactionReference(Max35Text submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
	}

	@XmlElement(name = "ForcdMtch", required = true)
	public YesNoIndicator getForcedMatch() {
		return forcedMatch;
	}

	public void setForcedMatch(YesNoIndicator forcedMatch) {
		this.forcedMatch = forcedMatch;
	}
}