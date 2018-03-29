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
import com.tools20022.repository.area.admi.ProcessingRequestV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the processing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails19#mmType
 * RequestDetails19.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails19#mmRequestorIdentification
 * RequestDetails19.mmRequestorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails19#mmAdditionalRequestInformation
 * RequestDetails19.mmAdditionalRequestInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ProcessingRequestV01#mmRequest
 * ProcessingRequestV01.mmRequest}</li>
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
 * "RequestDetails19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the processing request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.RequestDetails3
 * RequestDetails3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestDetails19", propOrder = {"type", "requestorIdentification", "additionalRequestInformation"})
public class RequestDetails19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected Max35Text type;
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails19
	 * RequestDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of data being requested, for example, a sub-member BIC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails3#mmType
	 * RequestDetails3.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails19, Max35Text> mmType = new MMMessageAttribute<RequestDetails19, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails19.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of data being requested, for example, a sub-member BIC.";
			previousVersion_lazy = () -> RequestDetails3.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RequestDetails19 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(RequestDetails19 obj, Max35Text value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "RqstrId")
	protected PartyIdentification73Choice requestorIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails19
	 * RequestDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identificates the requestor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails3#mmKey
	 * RequestDetails3.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails19, Optional<PartyIdentification73Choice>> mmRequestorIdentification = new MMMessageAttribute<RequestDetails19, Optional<PartyIdentification73Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails19.mmObject();
			isDerived = false;
			xmlTag = "RqstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorIdentification";
			definition = "Identificates the requestor.";
			previousVersion_lazy = () -> RequestDetails3.mmKey;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(RequestDetails19 obj) {
			return obj.getRequestorIdentification();
		}

		@Override
		public void setValue(RequestDetails19 obj, Optional<PartyIdentification73Choice> value) {
			obj.setRequestorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlReqInf")
	protected List<Max35Text> additionalRequestInformation;
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails19
	 * RequestDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlReqInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRequestInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information to support the processing request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails19, List<Max35Text>> mmAdditionalRequestInformation = new MMMessageAttribute<RequestDetails19, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails19.mmObject();
			isDerived = false;
			xmlTag = "AddtlReqInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRequestInformation";
			definition = "Additional information to support the processing request.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(RequestDetails19 obj) {
			return obj.getAdditionalRequestInformation();
		}

		@Override
		public void setValue(RequestDetails19 obj, List<Max35Text> value) {
			obj.setAdditionalRequestInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestDetails19.mmType, com.tools20022.repository.msg.RequestDetails19.mmRequestorIdentification,
						com.tools20022.repository.msg.RequestDetails19.mmAdditionalRequestInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ProcessingRequestV01.mmRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestDetails19";
				definition = "Details of the processing request.";
				previousVersion_lazy = () -> RequestDetails3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getType() {
		return type;
	}

	public RequestDetails19 setType(Max35Text type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<PartyIdentification73Choice> getRequestorIdentification() {
		return requestorIdentification == null ? Optional.empty() : Optional.of(requestorIdentification);
	}

	public RequestDetails19 setRequestorIdentification(PartyIdentification73Choice requestorIdentification) {
		this.requestorIdentification = requestorIdentification;
		return this;
	}

	public List<Max35Text> getAdditionalRequestInformation() {
		return additionalRequestInformation == null ? additionalRequestInformation = new ArrayList<>() : additionalRequestInformation;
	}

	public RequestDetails19 setAdditionalRequestInformation(List<Max35Text> additionalRequestInformation) {
		this.additionalRequestInformation = Objects.requireNonNull(additionalRequestInformation);
		return this;
	}
}