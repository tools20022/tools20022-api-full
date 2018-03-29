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
import com.tools20022.repository.area.tsmt.DataSetSubmissionV05;
import com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TradeCertificate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentIdentification1;
import com.tools20022.repository.msg.PartyIdentification26;
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
 * Formal document used to record a fact and used as proof of the fact, in the
 * context of a commercial trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmDataSetIdentification
 * OtherCertificateDataSet2.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmCertificateIdentification
 * OtherCertificateDataSet2.mmCertificateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmCertificateType
 * OtherCertificateDataSet2.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmIssueDate
 * OtherCertificateDataSet2.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmIssuer
 * OtherCertificateDataSet2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmCertificateInformation
 * OtherCertificateDataSet2.mmCertificateInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmOtherCertificateDataSet
 * ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmOtherCertificateDataSet
 * DataSetSubmissionV05.mmOtherCertificateDataSet}</li>
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
 * "OtherCertificateDataSet2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1
 * OtherCertificateDataSet1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherCertificateDataSet2", propOrder = {"dataSetIdentification", "certificateIdentification", "certificateType", "issueDate", "issuer", "certificateInformation"})
public class OtherCertificateDataSet2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DocumentIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the certificate data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmDataSetIdentification
	 * OtherCertificateDataSet1.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCertificateDataSet2, DocumentIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<OtherCertificateDataSet2, DocumentIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identifies the certificate data set.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1.mmObject();
		}

		@Override
		public DocumentIdentification1 getValue(OtherCertificateDataSet2 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, DocumentIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "CertId", required = true)
	protected Max35Text certificateIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmCertificateIdentification
	 * OtherCertificateDataSet1.mmCertificateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCertificateDataSet2, Max35Text> mmCertificateIdentification = new MMMessageAttribute<OtherCertificateDataSet2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Unique identifier of the document.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmCertificateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OtherCertificateDataSet2 obj) {
			return obj.getCertificateIdentification();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, Max35Text value) {
			obj.setCertificateIdentification(value);
		}
	};
	@XmlElement(name = "CertTp", required = true)
	protected Exact4AlphaNumericText certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmCertificateType
	 * TradeCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmCertificateType
	 * OtherCertificateDataSet1.mmCertificateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCertificateDataSet2, Exact4AlphaNumericText> mmCertificateType = new MMMessageAttribute<OtherCertificateDataSet2, Exact4AlphaNumericText>() {
		{
			businessElementTrace_lazy = () -> TradeCertificate.mmCertificateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmCertificateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Exact4AlphaNumericText getValue(OtherCertificateDataSet2 obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, Exact4AlphaNumericText value) {
			obj.setCertificateType(value);
		}
	};
	@XmlElement(name = "IsseDt", required = true)
	protected ISODate issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmIssueDate
	 * OtherCertificateDataSet1.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCertificateDataSet2, ISODate> mmIssueDate = new MMMessageAttribute<OtherCertificateDataSet2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(OtherCertificateDataSet2 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected PartyIdentification26 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer of the certificate, typically the inspection company or its agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmIssuer
	 * OtherCertificateDataSet1.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OtherCertificateDataSet2, PartyIdentification26> mmIssuer = new MMMessageAssociationEnd<OtherCertificateDataSet2, PartyIdentification26>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer of the certificate, typically the inspection company or its agent.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmIssuer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(OtherCertificateDataSet2 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, PartyIdentification26 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "CertInf")
	protected List<Max350Text> certificateInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional and important information that could not be captured by structured fields."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmCertificateInformation
	 * OtherCertificateDataSet1.mmCertificateInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OtherCertificateDataSet2, List<Max350Text>> mmCertificateInformation = new MMMessageAttribute<OtherCertificateDataSet2, List<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherCertificateDataSet2.mmObject();
			isDerived = false;
			xmlTag = "CertInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateInformation";
			definition = "Additional and important information that could not be captured by structured fields.";
			previousVersion_lazy = () -> OtherCertificateDataSet1.mmCertificateInformation;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public List<Max350Text> getValue(OtherCertificateDataSet2 obj) {
			return obj.getCertificateInformation();
		}

		@Override
		public void setValue(OtherCertificateDataSet2 obj, List<Max350Text> value) {
			obj.setCertificateInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherCertificateDataSet2.mmDataSetIdentification, com.tools20022.repository.msg.OtherCertificateDataSet2.mmCertificateIdentification,
						com.tools20022.repository.msg.OtherCertificateDataSet2.mmCertificateType, com.tools20022.repository.msg.OtherCertificateDataSet2.mmIssueDate, com.tools20022.repository.msg.OtherCertificateDataSet2.mmIssuer,
						com.tools20022.repository.msg.OtherCertificateDataSet2.mmCertificateInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet, DataSetSubmissionV05.mmOtherCertificateDataSet);
				trace_lazy = () -> TradeCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherCertificateDataSet2";
				definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
				previousVersion_lazy = () -> OtherCertificateDataSet1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public OtherCertificateDataSet2 setDataSetIdentification(DocumentIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public OtherCertificateDataSet2 setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = Objects.requireNonNull(certificateIdentification);
		return this;
	}

	public Exact4AlphaNumericText getCertificateType() {
		return certificateType;
	}

	public OtherCertificateDataSet2 setCertificateType(Exact4AlphaNumericText certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public OtherCertificateDataSet2 setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public PartyIdentification26 getIssuer() {
		return issuer;
	}

	public OtherCertificateDataSet2 setIssuer(PartyIdentification26 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<Max350Text> getCertificateInformation() {
		return certificateInformation == null ? certificateInformation = new ArrayList<>() : certificateInformation;
	}

	public OtherCertificateDataSet2 setCertificateInformation(List<Max350Text> certificateInformation) {
		this.certificateInformation = Objects.requireNonNull(certificateInformation);
		return this;
	}
}