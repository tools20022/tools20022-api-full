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
import com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01;
import com.tools20022.repository.codeset.PresentationMedium1Code;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingUltimateObligor;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Document9;
import com.tools20022.repository.msg.PartyIdentification43;
import com.tools20022.repository.msg.UndertakingIssuanceMessage;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the advice for the issuance of an undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmApplicantReferenceNumber
 * UndertakingAdvice2.mmApplicantReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmObligor
 * UndertakingAdvice2.mmObligor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmUndertakingIssuanceMessage
 * UndertakingAdvice2.mmUndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmOriginalIssuedMedium
 * UndertakingAdvice2.mmOriginalIssuedMedium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmEnclosedFile
 * UndertakingAdvice2.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#mmAdditionalInformation
 * UndertakingAdvice2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01#mmUndertakingIssuanceNotificationDetails
 * UndertakingIssuanceNotificationV01.mmUndertakingIssuanceNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingAdvice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the advice for the issuance of an undertaking."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant1Rule#forUndertakingAdvice2
 * ConstraintApplicant1Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant2Rule#forUndertakingAdvice2
 * ConstraintApplicant2Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant3Rule#forUndertakingAdvice2
 * ConstraintApplicant3Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant4Rule#forUndertakingAdvice2
 * ConstraintApplicant4Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant5Rule#forUndertakingAdvice2
 * ConstraintApplicant5Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant6Rule#forUndertakingAdvice2
 * ConstraintApplicant6Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType1Rule#forUndertakingAdvice2
 * ConstraintIssuanceType1Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType2Rule#forUndertakingAdvice2
 * ConstraintIssuanceType2Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType3Rule#forUndertakingAdvice2
 * ConstraintIssuanceType3Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType4Rule#forUndertakingAdvice2
 * ConstraintIssuanceType4Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType5Rule#forUndertakingAdvice2
 * ConstraintIssuanceType5Rule.forUndertakingAdvice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceType6Rule#forUndertakingAdvice2
 * ConstraintIssuanceType6Rule.forUndertakingAdvice2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingAdvice2", propOrder = {"applicantReferenceNumber", "obligor", "undertakingIssuanceMessage", "originalIssuedMedium", "enclosedFile", "additionalInformation"})
public class UndertakingAdvice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ApplcntRefNb", required = true)
	protected Max35Text applicantReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplcntRefNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicantReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier assigned by the applicant to the undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingAdvice2, Max35Text> mmApplicantReferenceNumber = new MMMessageAttribute<UndertakingAdvice2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "ApplcntRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicantReferenceNumber";
			definition = "Unique and unambiguous identifier assigned by the applicant to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(UndertakingAdvice2 obj) {
			return obj.getApplicantReferenceNumber();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, Max35Text value) {
			obj.setApplicantReferenceNumber(value);
		}
	};
	@XmlElement(name = "Oblgr")
	protected PartyIdentification43 obligor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party obligated to reimburse the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice2, Optional<PartyIdentification43>> mmObligor = new MMMessageAssociationEnd<UndertakingAdvice2, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingUltimateObligor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "Oblgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligor";
			definition = "Party obligated to reimburse the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(UndertakingAdvice2 obj) {
			return obj.getObligor();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, Optional<PartyIdentification43> value) {
			obj.setObligor(value.orElse(null));
		}
	};
	@XmlElement(name = "UdrtkgIssncMsg", required = true)
	protected UndertakingIssuanceMessage undertakingIssuanceMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage
	 * UndertakingIssuanceMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgIssncMsg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuanceMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of the related UndertakingIssuance message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice2, UndertakingIssuanceMessage> mmUndertakingIssuanceMessage = new MMMessageAssociationEnd<UndertakingAdvice2, UndertakingIssuanceMessage>() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgIssncMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceMessage";
			definition = "Contents of the related UndertakingIssuance message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingIssuanceMessage.mmObject();
		}

		@Override
		public UndertakingIssuanceMessage getValue(UndertakingAdvice2 obj) {
			return obj.getUndertakingIssuanceMessage();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, UndertakingIssuanceMessage value) {
			obj.setUndertakingIssuanceMessage(value);
		}
	};
	@XmlElement(name = "OrgnlIssdMdm")
	protected PresentationMedium1Code originalIssuedMedium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMedium1Code
	 * PresentationMedium1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmMedium
	 * Presentation.mmMedium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIssdMdm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIssuedMedium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium used to issue the original undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingAdvice2, Optional<PresentationMedium1Code>> mmOriginalIssuedMedium = new MMMessageAttribute<UndertakingAdvice2, Optional<PresentationMedium1Code>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmMedium;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIssdMdm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIssuedMedium";
			definition = "Medium used to issue the original undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PresentationMedium1Code.mmObject();
		}

		@Override
		public Optional<PresentationMedium1Code> getValue(UndertakingAdvice2 obj) {
			return obj.getOriginalIssuedMedium();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, Optional<PresentationMedium1Code> value) {
			obj.setOriginalIssuedMedium(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document or template enclosed in the notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice2, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<UndertakingAdvice2, List<Document9>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the notification.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(UndertakingAdvice2 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, List<Document9> value) {
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
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2
	 * UndertakingAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the undertaking notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingAdvice2, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<UndertakingAdvice2, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the undertaking notification.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingAdvice2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(UndertakingAdvice2 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingAdvice2.mmApplicantReferenceNumber, com.tools20022.repository.msg.UndertakingAdvice2.mmObligor,
						com.tools20022.repository.msg.UndertakingAdvice2.mmUndertakingIssuanceMessage, com.tools20022.repository.msg.UndertakingAdvice2.mmOriginalIssuedMedium,
						com.tools20022.repository.msg.UndertakingAdvice2.mmEnclosedFile, com.tools20022.repository.msg.UndertakingAdvice2.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingIssuanceNotificationV01.mmUndertakingIssuanceNotificationDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintApplicant1Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintApplicant2Rule.forUndertakingAdvice2,
						com.tools20022.repository.constraints.ConstraintApplicant3Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintApplicant4Rule.forUndertakingAdvice2,
						com.tools20022.repository.constraints.ConstraintApplicant5Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintApplicant6Rule.forUndertakingAdvice2,
						com.tools20022.repository.constraints.ConstraintIssuanceType1Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintIssuanceType2Rule.forUndertakingAdvice2,
						com.tools20022.repository.constraints.ConstraintIssuanceType3Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintIssuanceType4Rule.forUndertakingAdvice2,
						com.tools20022.repository.constraints.ConstraintIssuanceType5Rule.forUndertakingAdvice2, com.tools20022.repository.constraints.ConstraintIssuanceType6Rule.forUndertakingAdvice2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAdvice2";
				definition = "Details of the advice for the issuance of an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicantReferenceNumber() {
		return applicantReferenceNumber;
	}

	public UndertakingAdvice2 setApplicantReferenceNumber(Max35Text applicantReferenceNumber) {
		this.applicantReferenceNumber = Objects.requireNonNull(applicantReferenceNumber);
		return this;
	}

	public Optional<PartyIdentification43> getObligor() {
		return obligor == null ? Optional.empty() : Optional.of(obligor);
	}

	public UndertakingAdvice2 setObligor(PartyIdentification43 obligor) {
		this.obligor = obligor;
		return this;
	}

	public UndertakingIssuanceMessage getUndertakingIssuanceMessage() {
		return undertakingIssuanceMessage;
	}

	public UndertakingAdvice2 setUndertakingIssuanceMessage(UndertakingIssuanceMessage undertakingIssuanceMessage) {
		this.undertakingIssuanceMessage = Objects.requireNonNull(undertakingIssuanceMessage);
		return this;
	}

	public Optional<PresentationMedium1Code> getOriginalIssuedMedium() {
		return originalIssuedMedium == null ? Optional.empty() : Optional.of(originalIssuedMedium);
	}

	public UndertakingAdvice2 setOriginalIssuedMedium(PresentationMedium1Code originalIssuedMedium) {
		this.originalIssuedMedium = originalIssuedMedium;
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public UndertakingAdvice2 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public UndertakingAdvice2 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}