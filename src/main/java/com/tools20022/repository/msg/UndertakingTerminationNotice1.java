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
import com.tools20022.repository.area.tsrv.UndertakingTerminationNotificationV01;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Document9;
import com.tools20022.repository.msg.Undertaking9;
import com.tools20022.repository.msg.UndertakingTermination3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the notification of the termination of an undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmUndertakingIdentification
 * UndertakingTerminationNotice1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmTerminationDetails
 * UndertakingTerminationNotice1.mmTerminationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmEnclosedFile
 * UndertakingTerminationNotice1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1#mmAdditionalInformation
 * UndertakingTerminationNotice1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingStatus
 * UndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingTerminationNotificationV01#mmUndertakingTerminationNotificationDetails
 * UndertakingTerminationNotificationV01.
 * mmUndertakingTerminationNotificationDetails}</li>
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
 * "UndertakingTerminationNotice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the notification of the termination of an undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingTerminationNotice1", propOrder = {"undertakingIdentification", "terminationDetails", "enclosedFile", "additionalInformation"})
public class UndertakingTerminationNotice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking9 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking9
	 * Undertaking9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
	 * UndertakingStatus.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1
	 * UndertakingTerminationNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingTerminationNotice1, Undertaking9> mmUndertakingIdentification = new MMMessageAssociationEnd<UndertakingTerminationNotice1, Undertaking9>() {
		{
			businessElementTrace_lazy = () -> UndertakingStatus.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingTerminationNotice1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking9.mmObject();
		}

		@Override
		public Undertaking9 getValue(UndertakingTerminationNotice1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(UndertakingTerminationNotice1 obj, Undertaking9 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "TermntnDtls", required = true)
	protected UndertakingTermination3 terminationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTermination3
	 * UndertakingTermination3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1
	 * UndertakingTerminationNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the termination of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingTerminationNotice1, UndertakingTermination3> mmTerminationDetails = new MMMessageAssociationEnd<UndertakingTerminationNotice1, UndertakingTermination3>() {
		{
			businessComponentTrace_lazy = () -> UndertakingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingTerminationNotice1.mmObject();
			isDerived = false;
			xmlTag = "TermntnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDetails";
			definition = "Details related to the termination of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingTermination3.mmObject();
		}

		@Override
		public UndertakingTermination3 getValue(UndertakingTerminationNotice1 obj) {
			return obj.getTerminationDetails();
		}

		@Override
		public void setValue(UndertakingTerminationNotice1 obj, UndertakingTermination3 value) {
			obj.setTerminationDetails(value);
		}
	};
	@XmlElement(name = "NclsdFile")
	protected List<Document9> enclosedFile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document9 Document9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
	 * Undertaking.mmSpecifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1
	 * UndertakingTerminationNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document or template enclosed in the termination notification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingTerminationNotice1, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<UndertakingTerminationNotice1, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingTerminationNotice1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the termination notification.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(UndertakingTerminationNotice1 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(UndertakingTerminationNotice1 obj, List<Document9> value) {
			obj.setEnclosedFile(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingTerminationNotice1
	 * UndertakingTerminationNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingTerminationNotice1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<UndertakingTerminationNotice1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingTerminationNotice1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the notification.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingTerminationNotice1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(UndertakingTerminationNotice1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingTerminationNotice1.mmUndertakingIdentification, com.tools20022.repository.msg.UndertakingTerminationNotice1.mmTerminationDetails,
						com.tools20022.repository.msg.UndertakingTerminationNotice1.mmEnclosedFile, com.tools20022.repository.msg.UndertakingTerminationNotice1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingTerminationNotificationV01.mmUndertakingTerminationNotificationDetails);
				trace_lazy = () -> UndertakingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingTerminationNotice1";
				definition = "Information about the notification of the termination of an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public UndertakingTerminationNotice1 setUndertakingIdentification(Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public UndertakingTermination3 getTerminationDetails() {
		return terminationDetails;
	}

	public UndertakingTerminationNotice1 setTerminationDetails(UndertakingTermination3 terminationDetails) {
		this.terminationDetails = Objects.requireNonNull(terminationDetails);
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public UndertakingTerminationNotice1 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public UndertakingTerminationNotice1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}