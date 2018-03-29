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
import com.tools20022.repository.codeset.TradeCertificateType1Code;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TradeCertificate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.PartyIdentification27;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details relative to the submission of the certificate data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmSubmitter
 * RequiredSubmission4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmCertificateType
 * RequiredSubmission4.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchIssuer
 * RequiredSubmission4.mmMatchIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchIssueDate
 * RequiredSubmission4.mmMatchIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchInspectionDate
 * RequiredSubmission4.mmMatchInspectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmAuthorisedInspectorIndicator
 * RequiredSubmission4.mmAuthorisedInspectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchConsignee
 * RequiredSubmission4.mmMatchConsignee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmMatchManufacturer
 * RequiredSubmission4.mmMatchManufacturer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmLineItemIdentification
 * RequiredSubmission4.mmLineItemIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
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
 * "RequiredSubmission4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details relative to the submission of the certificate data set."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequiredSubmission4", propOrder = {"submitter", "certificateType", "matchIssuer", "matchIssueDate", "matchInspectionDate", "authorisedInspectorIndicator", "matchConsignee", "matchManufacturer", "lineItemIdentification"})
public class RequiredSubmission4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Submitr", required = true)
	protected List<BICIdentification1> submitter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies with party(ies) is authorised to submit the data set as part of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequiredSubmission4, List<BICIdentification1>> mmSubmitter = new MMMessageAssociationEnd<RequiredSubmission4, List<BICIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "Specifies with party(ies) is authorised to submit the data set as part of the transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(RequiredSubmission4 obj) {
			return obj.getSubmitter();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, List<BICIdentification1> value) {
			obj.setSubmitter(value);
		}
	};
	@XmlElement(name = "CertTp", required = true)
	protected TradeCertificateType1Code certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateType1Code
	 * TradeCertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmCertificateType
	 * TradeCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, TradeCertificateType1Code> mmCertificateType = new MMMessageAttribute<RequiredSubmission4, TradeCertificateType1Code>() {
		{
			businessElementTrace_lazy = () -> TradeCertificate.mmCertificateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateType1Code.mmObject();
		}

		@Override
		public TradeCertificateType1Code getValue(RequiredSubmission4 obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, TradeCertificateType1Code value) {
			obj.setCertificateType(value);
		}
	};
	@XmlElement(name = "MtchIssr")
	protected PartyIdentification27 matchIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification27
	 * PartyIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequiredSubmission4, Optional<PartyIdentification27>> mmMatchIssuer = new MMMessageAssociationEnd<RequiredSubmission4, Optional<PartyIdentification27>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssuer";
			definition = "Specifies if the issuer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification27.mmObject();
		}

		@Override
		public Optional<PartyIdentification27> getValue(RequiredSubmission4 obj) {
			return obj.getMatchIssuer();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, Optional<PartyIdentification27> value) {
			obj.setMatchIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchIsseDt", required = true)
	protected YesNoIndicator matchIssueDate;
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
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issue date must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, YesNoIndicator> mmMatchIssueDate = new MMMessageAttribute<RequiredSubmission4, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchIsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssueDate";
			definition = "Specifies if the issue date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission4 obj) {
			return obj.getMatchIssueDate();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, YesNoIndicator value) {
			obj.setMatchIssueDate(value);
		}
	};
	@XmlElement(name = "MtchInspctnDt", required = true)
	protected YesNoIndicator matchInspectionDate;
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
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchInspctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchInspectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the inspection date must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, YesNoIndicator> mmMatchInspectionDate = new MMMessageAttribute<RequiredSubmission4, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchInspctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchInspectionDate";
			definition = "Specifies if the inspection date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission4 obj) {
			return obj.getMatchInspectionDate();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, YesNoIndicator value) {
			obj.setMatchInspectionDate(value);
		}
	};
	@XmlElement(name = "AuthrsdInspctrInd", required = true)
	protected YesNoIndicator authorisedInspectorIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdInspctrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedInspectorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the indication of an authorised inspector must be present as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, YesNoIndicator> mmAuthorisedInspectorIndicator = new MMMessageAttribute<RequiredSubmission4, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdInspctrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedInspectorIndicator";
			definition = "Specifies if the indication of an authorised inspector must be present as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission4 obj) {
			return obj.getAuthorisedInspectorIndicator();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, YesNoIndicator value) {
			obj.setAuthorisedInspectorIndicator(value);
		}
	};
	@XmlElement(name = "MtchConsgn", required = true)
	protected YesNoIndicator matchConsignee;
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
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchConsgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchConsignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the consignee must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, YesNoIndicator> mmMatchConsignee = new MMMessageAttribute<RequiredSubmission4, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchConsgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchConsignee";
			definition = "Specifies if the consignee must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission4 obj) {
			return obj.getMatchConsignee();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, YesNoIndicator value) {
			obj.setMatchConsignee(value);
		}
	};
	@XmlElement(name = "MtchManfctr")
	protected PartyIdentification27 matchManufacturer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification27
	 * PartyIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchManfctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchManufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the manufacturer must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequiredSubmission4, Optional<PartyIdentification27>> mmMatchManufacturer = new MMMessageAssociationEnd<RequiredSubmission4, Optional<PartyIdentification27>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "MtchManfctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchManufacturer";
			definition = "Specifies if the manufacturer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification27.mmObject();
		}

		@Override
		public Optional<PartyIdentification27> getValue(RequiredSubmission4 obj) {
			return obj.getMatchManufacturer();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, Optional<PartyIdentification27> value) {
			obj.setMatchManufacturer(value.orElse(null));
		}
	};
	@XmlElement(name = "LineItmId")
	protected List<Max70Text> lineItemIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4
	 * RequiredSubmission4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the certificate data set is required in relation to specific line items, and which line items."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission4, List<Max70Text>> mmLineItemIdentification = new MMMessageAttribute<RequiredSubmission4, List<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission4.mmObject();
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Specifies if the certificate data set is required in relation to specific line items, and which line items.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(RequiredSubmission4 obj) {
			return obj.getLineItemIdentification();
		}

		@Override
		public void setValue(RequiredSubmission4 obj, List<Max70Text> value) {
			obj.setLineItemIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission4.mmSubmitter, com.tools20022.repository.msg.RequiredSubmission4.mmCertificateType,
						com.tools20022.repository.msg.RequiredSubmission4.mmMatchIssuer, com.tools20022.repository.msg.RequiredSubmission4.mmMatchIssueDate, com.tools20022.repository.msg.RequiredSubmission4.mmMatchInspectionDate,
						com.tools20022.repository.msg.RequiredSubmission4.mmAuthorisedInspectorIndicator, com.tools20022.repository.msg.RequiredSubmission4.mmMatchConsignee,
						com.tools20022.repository.msg.RequiredSubmission4.mmMatchManufacturer, com.tools20022.repository.msg.RequiredSubmission4.mmLineItemIdentification);
				trace_lazy = () -> TradeCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequiredSubmission4";
				definition = "Specifies the details relative to the submission of the certificate data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<BICIdentification1> getSubmitter() {
		return submitter == null ? submitter = new ArrayList<>() : submitter;
	}

	public RequiredSubmission4 setSubmitter(List<BICIdentification1> submitter) {
		this.submitter = Objects.requireNonNull(submitter);
		return this;
	}

	public TradeCertificateType1Code getCertificateType() {
		return certificateType;
	}

	public RequiredSubmission4 setCertificateType(TradeCertificateType1Code certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public Optional<PartyIdentification27> getMatchIssuer() {
		return matchIssuer == null ? Optional.empty() : Optional.of(matchIssuer);
	}

	public RequiredSubmission4 setMatchIssuer(PartyIdentification27 matchIssuer) {
		this.matchIssuer = matchIssuer;
		return this;
	}

	public YesNoIndicator getMatchIssueDate() {
		return matchIssueDate;
	}

	public RequiredSubmission4 setMatchIssueDate(YesNoIndicator matchIssueDate) {
		this.matchIssueDate = Objects.requireNonNull(matchIssueDate);
		return this;
	}

	public YesNoIndicator getMatchInspectionDate() {
		return matchInspectionDate;
	}

	public RequiredSubmission4 setMatchInspectionDate(YesNoIndicator matchInspectionDate) {
		this.matchInspectionDate = Objects.requireNonNull(matchInspectionDate);
		return this;
	}

	public YesNoIndicator getAuthorisedInspectorIndicator() {
		return authorisedInspectorIndicator;
	}

	public RequiredSubmission4 setAuthorisedInspectorIndicator(YesNoIndicator authorisedInspectorIndicator) {
		this.authorisedInspectorIndicator = Objects.requireNonNull(authorisedInspectorIndicator);
		return this;
	}

	public YesNoIndicator getMatchConsignee() {
		return matchConsignee;
	}

	public RequiredSubmission4 setMatchConsignee(YesNoIndicator matchConsignee) {
		this.matchConsignee = Objects.requireNonNull(matchConsignee);
		return this;
	}

	public Optional<PartyIdentification27> getMatchManufacturer() {
		return matchManufacturer == null ? Optional.empty() : Optional.of(matchManufacturer);
	}

	public RequiredSubmission4 setMatchManufacturer(PartyIdentification27 matchManufacturer) {
		this.matchManufacturer = matchManufacturer;
		return this;
	}

	public List<Max70Text> getLineItemIdentification() {
		return lineItemIdentification == null ? lineItemIdentification = new ArrayList<>() : lineItemIdentification;
	}

	public RequiredSubmission4 setLineItemIdentification(List<Max70Text> lineItemIdentification) {
		this.lineItemIdentification = Objects.requireNonNull(lineItemIdentification);
		return this;
	}
}