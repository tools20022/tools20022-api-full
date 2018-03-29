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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
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
 * Additional references linked to the order status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderMassStatusRequestIdentification
 * Reference15.mmOrderMassStatusRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderStatusRequestIdentification
 * Reference15.mmOrderStatusRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderIdentification
 * Reference15.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmHostCrossIdentification
 * Reference15.mmHostCrossIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmCrossOrderIdentification
 * Reference15.mmCrossOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOriginalCrossOrderIdentification
 * Reference15.mmOriginalCrossOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmClientOrderIdentification
 * Reference15.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmSecondaryOrderIdentification
 * Reference15.mmSecondaryOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmSecondaryClientOrderIdentification
 * Reference15.mmSecondaryClientOrderIdentification}</li>
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
 * "Reference15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional references linked to the order status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reference15", propOrder = {"orderMassStatusRequestIdentification", "orderStatusRequestIdentification", "orderIdentification", "hostCrossIdentification", "crossOrderIdentification", "originalCrossOrderIdentification",
		"clientOrderIdentification", "secondaryOrderIdentification", "secondaryClientOrderIdentification"})
public class Reference15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrMassStsReqId")
	protected Max35Text orderMassStatusRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrMassStsReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 584</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderMassStatusRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by issuer of Mass Status Request to uniquely identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmOrderMassStatusRequestIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrMassStsReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "584"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderMassStatusRequestIdentification";
			definition = "Identification assigned by issuer of Mass Status Request to uniquely identify the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getOrderMassStatusRequestIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setOrderMassStatusRequestIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrStsReqId")
	protected Max35Text orderStatusRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrStsReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 790</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatusRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by issuer of Order Status Request to uniquely identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmOrderStatusRequestIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrStsReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "790"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderStatusRequestIdentification";
			definition = "Identification assigned by issuer of Order Status Request to uniquely identify the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getOrderStatusRequestIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setOrderStatusRequestIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrId", required = true)
	protected Max35Text orderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 37</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier for Order as assigned by sell-side."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Max35Text> mmOrderIdentification = new MMMessageAttribute<Reference15, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "37"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Unique identifier for Order as assigned by sell-side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference15 obj) {
			return obj.getOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Max35Text value) {
			obj.setOrderIdentification(value);
		}
	};
	@XmlElement(name = "HstCrossId")
	protected Max35Text hostCrossIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstCrossId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 961</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCrossIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmHostCrossIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "HstCrossId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "961"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCrossIdentification";
			definition = "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getHostCrossIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setHostCrossIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CrossOrdrId")
	protected Max35Text crossOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrossOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 548</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for a cross order. Must be unique during a given trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmCrossOrderIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "CrossOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "548"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossOrderIdentification";
			definition = "Identifier for a cross order. Must be unique during a given trading day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getCrossOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setCrossOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCrossOrdrId")
	protected Max35Text originalCrossOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCrossOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 551</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCrossOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in Cross Order Modification Request and Cross Order Cancellation Request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmOriginalCrossOrderIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCrossOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "551"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCrossOrderIdentification";
			definition = "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in Cross Order Modification Request and Cross Order Cancellation Request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getOriginalCrossOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setOriginalCrossOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntOrdrId")
	protected Max35Text clientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 11</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier for Order as assigned by the buy-side."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmClientOrderIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "11"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for Order as assigned by the buy-side.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getClientOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setClientOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryOrdrId")
	protected Max35Text secondaryOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 198</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier assigned by the party which accepts the order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmSecondaryOrderIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "ScndryOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "198"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOrderIdentification";
			definition = "Identifier assigned by the party which accepts the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getSecondaryOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setSecondaryOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryClntOrdrId")
	protected Max35Text secondaryClientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 526</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier assigned by the party which originates the order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference15, Optional<Max35Text>> mmSecondaryClientOrderIdentification = new MMMessageAttribute<Reference15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Reference15.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "526"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Identifier assigned by the party which originates the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Reference15 obj) {
			return obj.getSecondaryClientOrderIdentification();
		}

		@Override
		public void setValue(Reference15 obj, Optional<Max35Text> value) {
			obj.setSecondaryClientOrderIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Reference15.mmOrderMassStatusRequestIdentification, com.tools20022.repository.msg.Reference15.mmOrderStatusRequestIdentification,
						com.tools20022.repository.msg.Reference15.mmOrderIdentification, com.tools20022.repository.msg.Reference15.mmHostCrossIdentification, com.tools20022.repository.msg.Reference15.mmCrossOrderIdentification,
						com.tools20022.repository.msg.Reference15.mmOriginalCrossOrderIdentification, com.tools20022.repository.msg.Reference15.mmClientOrderIdentification,
						com.tools20022.repository.msg.Reference15.mmSecondaryOrderIdentification, com.tools20022.repository.msg.Reference15.mmSecondaryClientOrderIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference15";
				definition = "Additional references linked to the order status.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOrderMassStatusRequestIdentification() {
		return orderMassStatusRequestIdentification == null ? Optional.empty() : Optional.of(orderMassStatusRequestIdentification);
	}

	public Reference15 setOrderMassStatusRequestIdentification(Max35Text orderMassStatusRequestIdentification) {
		this.orderMassStatusRequestIdentification = orderMassStatusRequestIdentification;
		return this;
	}

	public Optional<Max35Text> getOrderStatusRequestIdentification() {
		return orderStatusRequestIdentification == null ? Optional.empty() : Optional.of(orderStatusRequestIdentification);
	}

	public Reference15 setOrderStatusRequestIdentification(Max35Text orderStatusRequestIdentification) {
		this.orderStatusRequestIdentification = orderStatusRequestIdentification;
		return this;
	}

	public Max35Text getOrderIdentification() {
		return orderIdentification;
	}

	public Reference15 setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = Objects.requireNonNull(orderIdentification);
		return this;
	}

	public Optional<Max35Text> getHostCrossIdentification() {
		return hostCrossIdentification == null ? Optional.empty() : Optional.of(hostCrossIdentification);
	}

	public Reference15 setHostCrossIdentification(Max35Text hostCrossIdentification) {
		this.hostCrossIdentification = hostCrossIdentification;
		return this;
	}

	public Optional<Max35Text> getCrossOrderIdentification() {
		return crossOrderIdentification == null ? Optional.empty() : Optional.of(crossOrderIdentification);
	}

	public Reference15 setCrossOrderIdentification(Max35Text crossOrderIdentification) {
		this.crossOrderIdentification = crossOrderIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalCrossOrderIdentification() {
		return originalCrossOrderIdentification == null ? Optional.empty() : Optional.of(originalCrossOrderIdentification);
	}

	public Reference15 setOriginalCrossOrderIdentification(Max35Text originalCrossOrderIdentification) {
		this.originalCrossOrderIdentification = originalCrossOrderIdentification;
		return this;
	}

	public Optional<Max35Text> getClientOrderIdentification() {
		return clientOrderIdentification == null ? Optional.empty() : Optional.of(clientOrderIdentification);
	}

	public Reference15 setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = clientOrderIdentification;
		return this;
	}

	public Optional<Max35Text> getSecondaryOrderIdentification() {
		return secondaryOrderIdentification == null ? Optional.empty() : Optional.of(secondaryOrderIdentification);
	}

	public Reference15 setSecondaryOrderIdentification(Max35Text secondaryOrderIdentification) {
		this.secondaryOrderIdentification = secondaryOrderIdentification;
		return this;
	}

	public Optional<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? Optional.empty() : Optional.of(secondaryClientOrderIdentification);
	}

	public Reference15 setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
		return this;
	}
}