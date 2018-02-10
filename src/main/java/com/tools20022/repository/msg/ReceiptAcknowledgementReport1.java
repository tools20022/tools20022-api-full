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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the original request. Identifies the message being
 * acknowledged and its status
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1#mmRelatedReference
 * ReceiptAcknowledgementReport1.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1#mmRequestHandling
 * ReceiptAcknowledgementReport1.mmRequestHandling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1#mmOriginalMessageIdentification
 * ReceiptAcknowledgementReport1.mmOriginalMessageIdentification}</li>
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
 * "ReceiptAcknowledgementReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the original request. Identifies the message being acknowledged and its status"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceiptAcknowledgementReport1", propOrder = {"relatedReference", "requestHandling", "originalMessageIdentification"})
public class ReceiptAcknowledgementReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef", required = true)
	protected AdditionalReferences relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1
	 * ReceiptAcknowledgementReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReferences.mmObject();
		}
	};
	@XmlElement(name = "ReqHdlg", required = true)
	protected RequestHandling1 requestHandling;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RequestHandling1
	 * RequestHandling1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1
	 * ReceiptAcknowledgementReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqHdlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestHandling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gives the status of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestHandling = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmObject();
			isDerived = false;
			xmlTag = "ReqHdlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestHandling";
			definition = "Gives the status of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RequestHandling1.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMsgId")
	protected MessageIdentification6 originalMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification6
	 * MessageIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiptAcknowledgementReport1
	 * ReceiptAcknowledgementReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the original message for which the acknowledgement is sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Identification of the original message for which the acknowledgement is sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmRelatedReference, com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmRequestHandling,
						com.tools20022.repository.msg.ReceiptAcknowledgementReport1.mmOriginalMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReceiptAcknowledgementReport1";
				definition = "Provides details on the original request. Identifies the message being acknowledged and its status";
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReferences getRelatedReference() {
		return relatedReference;
	}

	public ReceiptAcknowledgementReport1 setRelatedReference(com.tools20022.repository.msg.AdditionalReferences relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public RequestHandling1 getRequestHandling() {
		return requestHandling;
	}

	public ReceiptAcknowledgementReport1 setRequestHandling(com.tools20022.repository.msg.RequestHandling1 requestHandling) {
		this.requestHandling = Objects.requireNonNull(requestHandling);
		return this;
	}

	public Optional<MessageIdentification6> getOriginalMessageIdentification() {
		return originalMessageIdentification == null ? Optional.empty() : Optional.of(originalMessageIdentification);
	}

	public ReceiptAcknowledgementReport1 setOriginalMessageIdentification(com.tools20022.repository.msg.MessageIdentification6 originalMessageIdentification) {
		this.originalMessageIdentification = originalMessageIdentification;
		return this;
	}
}