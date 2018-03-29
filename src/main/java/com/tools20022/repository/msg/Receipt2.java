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
import com.tools20022.repository.area.camt.ReceiptV04;
import com.tools20022.repository.choice.PaymentIdentification5Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalMessageAndIssuer1;
import com.tools20022.repository.msg.RequestHandling1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Receipt2#mmOriginalMessageIdentification
 * Receipt2.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Receipt2#mmOriginalPaymentIdentification
 * Receipt2.mmOriginalPaymentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Receipt2#mmRequestHandling
 * Receipt2.mmRequestHandling}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReceiptV04#mmReceiptDetails
 * ReceiptV04.mmReceiptDetails}</li>
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
 * "Receipt2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Receipt1
 * Receipt1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Receipt2", propOrder = {"originalMessageIdentification", "originalPaymentIdentification", "requestHandling"})
public class Receipt2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected OriginalMessageAndIssuer1 originalMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageAndIssuer1
	 * OriginalMessageAndIssuer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Receipt2
	 * Receipt2}</li>
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
	 * definition} = "Identification of the original request message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Receipt1#mmOriginalMessageIdentification
	 * Receipt1.mmOriginalMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Receipt2, OriginalMessageAndIssuer1> mmOriginalMessageIdentification = new MMMessageAssociationEnd<Receipt2, OriginalMessageAndIssuer1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Receipt2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Identification of the original request message.";
			previousVersion_lazy = () -> Receipt1.mmOriginalMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMessageAndIssuer1.mmObject();
		}

		@Override
		public OriginalMessageAndIssuer1 getValue(Receipt2 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(Receipt2 obj, OriginalMessageAndIssuer1 value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlPmtId")
	protected PaymentIdentification5Choice originalPaymentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Receipt2
	 * Receipt2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the original transaction identification, when the request for which the receipt is generated is a payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Receipt2, Optional<PaymentIdentification5Choice>> mmOriginalPaymentIdentification = new MMMessageAssociationEnd<Receipt2, Optional<PaymentIdentification5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Receipt2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentIdentification";
			definition = "Identification of the original transaction identification, when the request for which the receipt is generated is a payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification5Choice.mmObject();
		}

		@Override
		public Optional<PaymentIdentification5Choice> getValue(Receipt2 obj) {
			return obj.getOriginalPaymentIdentification();
		}

		@Override
		public void setValue(Receipt2 obj, Optional<PaymentIdentification5Choice> value) {
			obj.setOriginalPaymentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqHdlg")
	protected List<RequestHandling1> requestHandling;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Receipt2
	 * Receipt2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Receipt1#mmRequestHandling
	 * Receipt1.mmRequestHandling}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Receipt2, List<RequestHandling1>> mmRequestHandling = new MMMessageAssociationEnd<Receipt2, List<RequestHandling1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Receipt2.mmObject();
			isDerived = false;
			xmlTag = "ReqHdlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestHandling";
			definition = "Gives the status of the request.";
			previousVersion_lazy = () -> Receipt1.mmRequestHandling;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RequestHandling1.mmObject();
		}

		@Override
		public List<RequestHandling1> getValue(Receipt2 obj) {
			return obj.getRequestHandling();
		}

		@Override
		public void setValue(Receipt2 obj, List<RequestHandling1> value) {
			obj.setRequestHandling(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Receipt2.mmOriginalMessageIdentification, com.tools20022.repository.msg.Receipt2.mmOriginalPaymentIdentification,
						com.tools20022.repository.msg.Receipt2.mmRequestHandling);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReceiptV04.mmReceiptDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Receipt2";
				definition = "Provides details on the request.";
				previousVersion_lazy = () -> Receipt1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public OriginalMessageAndIssuer1 getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public Receipt2 setOriginalMessageIdentification(OriginalMessageAndIssuer1 originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Optional<PaymentIdentification5Choice> getOriginalPaymentIdentification() {
		return originalPaymentIdentification == null ? Optional.empty() : Optional.of(originalPaymentIdentification);
	}

	public Receipt2 setOriginalPaymentIdentification(PaymentIdentification5Choice originalPaymentIdentification) {
		this.originalPaymentIdentification = originalPaymentIdentification;
		return this;
	}

	public List<RequestHandling1> getRequestHandling() {
		return requestHandling == null ? requestHandling = new ArrayList<>() : requestHandling;
	}

	public Receipt2 setRequestHandling(List<RequestHandling1> requestHandling) {
		this.requestHandling = Objects.requireNonNull(requestHandling);
		return this;
	}
}