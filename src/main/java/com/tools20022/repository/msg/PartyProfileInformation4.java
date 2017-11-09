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
import com.tools20022.repository.choice.CertificationType1Choice;
import com.tools20022.repository.choice.CustomerConductClassification1Choice;
import com.tools20022.repository.choice.KYCCheckType1Choice;
import com.tools20022.repository.choice.RiskLevel1Choice;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PersonProfile;
import com.tools20022.repository.entity.PrivateCertificate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information to support the Know Your Customer (KYC) processes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCertificationIndicator
 * PartyProfileInformation4.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmValidatingParty
 * PartyProfileInformation4.mmValidatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingParty
 * PartyProfileInformation4.mmCheckingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmResponsibleParty
 * PartyProfileInformation4.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCertificateType
 * PartyProfileInformation4.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingDate
 * PartyProfileInformation4.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingFrequency
 * PartyProfileInformation4.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmNextRevisionDate
 * PartyProfileInformation4.mmNextRevisionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmSalaryRange
 * PartyProfileInformation4.mmSalaryRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmSourceOfWealth
 * PartyProfileInformation4.mmSourceOfWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCustomerConductClassification
 * PartyProfileInformation4.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmRiskLevel
 * PartyProfileInformation4.mmRiskLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmKnowYourCustomerCheckType
 * PartyProfileInformation4.mmKnowYourCustomerCheckType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmKnowYourCustomerDatabaseCheck
 * PartyProfileInformation4.mmKnowYourCustomerDatabaseCheck}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyProfileInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information to support the Know Your Customer (KYC) processes."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation5
 * PartyProfileInformation5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3
 * PartyProfileInformation3}</li>
 * </ul>
 */
public class PartyProfileInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator certificationIndicator;
	/**
	 * Indicates whether the certificate type has been obtained and verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificationIndicator
	 * PrivateCertificate.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate type has been obtained and verified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificationIndicator
	 * PartyProfileInformation5.mmCertificationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificationIndicator
	 * PartyProfileInformation3.mmCertificationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificationIndicator;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCertificationIndicator);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCertificationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max140Text validatingParty;
	/**
	 * Identification of the person who validated the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who validated the document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmValidatingParty
	 * PartyProfileInformation5.mmValidatingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmValidatingParty
	 * PartyProfileInformation3.mmValidatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidatingParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "VldtngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidatingParty";
			definition = "Identification of the person who validated the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmValidatingParty);
			previousVersion_lazy = () -> PartyProfileInformation3.mmValidatingParty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text checkingParty;
	/**
	 * Identification of the person who checked the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who checked the document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingParty
	 * PartyProfileInformation5.mmCheckingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingParty
	 * PartyProfileInformation3.mmCheckingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "ChckngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingParty";
			definition = "Identification of the person who checked the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCheckingParty);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCheckingParty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text responsibleParty;
	/**
	 * Identification of the person who is responsible for the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsibleParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the person who is responsible for the document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmResponsibleParty
	 * PartyProfileInformation5.mmResponsibleParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmResponsibleParty
	 * PartyProfileInformation3.mmResponsibleParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponsibleParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Identification of the person who is responsible for the document.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmResponsibleParty);
			previousVersion_lazy = () -> PartyProfileInformation3.mmResponsibleParty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CertificationType1Choice certificateType;
	/**
	 * Type of certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CertificationType1Choice
	 * CertificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
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
	 * definition} = "Type of certificate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificateType
	 * PartyProfileInformation5.mmCertificateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificateType
	 * PartyProfileInformation3.mmCertificateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PrivateCertificate.mmObject();
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Type of certificate.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCertificateType);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCertificateType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CertificationType1Choice.mmObject();
		}
	};
	protected ISODate checkingDate;
	/**
	 * Date at which the certification check has been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingDate
	 * PrivateCertificate.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the certification check has been performed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingDate
	 * PartyProfileInformation5.mmCheckingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingDate
	 * PartyProfileInformation3.mmCheckingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingDate;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "ChckngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCheckingDate);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCheckingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected EventFrequency1Code checkingFrequency;
	/**
	 * Specifies how frequently the check is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingFrequency
	 * PrivateCertificate.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how frequently the check is performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingFrequency
	 * PartyProfileInformation5.mmCheckingFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingFrequency
	 * PartyProfileInformation3.mmCheckingFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingFrequency;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "ChckngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCheckingFrequency);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCheckingFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}
	};
	protected ISODate nextRevisionDate;
	/**
	 * Specifies the date at which the next certification check will be
	 * performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmNextRevisionDate
	 * PrivateCertificate.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtRvsnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRevisionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the next certification check will be performed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmNextRevisionDate
	 * PartyProfileInformation5.mmNextRevisionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmNextRevisionDate
	 * PartyProfileInformation3.mmNextRevisionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextRevisionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmNextRevisionDate;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "NxtRvsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmNextRevisionDate);
			previousVersion_lazy = () -> PartyProfileInformation3.mmNextRevisionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text salaryRange;
	/**
	 * Limits between which a person's salary is estimated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSalaryRange
	 * PersonProfile.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlryRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limits between which a person's salary is estimated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSalaryRange
	 * PartyProfileInformation5.mmSalaryRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSalaryRange
	 * PartyProfileInformation3.mmSalaryRange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSalaryRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSalaryRange;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "SlryRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryRange";
			definition = "Limits between which a person's salary is estimated.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmSalaryRange);
			previousVersion_lazy = () -> PartyProfileInformation3.mmSalaryRange;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max140Text sourceOfWealth;
	/**
	 * Indicates the main source of revenue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSourceOfWealth
	 * PersonProfile.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfWlth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the main source of revenue."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSourceOfWealth
	 * PartyProfileInformation5.mmSourceOfWealth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSourceOfWealth
	 * PartyProfileInformation3.mmSourceOfWealth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceOfWealth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSourceOfWealth;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "SrcOfWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main source of revenue.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmSourceOfWealth);
			previousVersion_lazy = () -> PartyProfileInformation3.mmSourceOfWealth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * Specifies an assessment of the customer’s behaviour at the time of the
	 * account opening application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerConductClassification1Choice
	 * CustomerConductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCndctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCustomerConductClassification
	 * PartyProfileInformation5.mmCustomerConductClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCustomerConductClassification
	 * PartyProfileInformation3.mmCustomerConductClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerConductClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Specifies an assessment of the customer’s behaviour at the time of the account opening application.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmCustomerConductClassification);
			previousVersion_lazy = () -> PartyProfileInformation3.mmCustomerConductClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}
	};
	protected RiskLevel1Choice riskLevel;
	/**
	 * Specifies the customer’s money laundering risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RiskLevel1Choice
	 * RiskLevel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the customer’s money laundering risk."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmRiskLevel
	 * PartyProfileInformation5.mmRiskLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmRiskLevel
	 * PartyProfileInformation3.mmRiskLevel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRiskLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "RskLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmRiskLevel);
			previousVersion_lazy = () -> PartyProfileInformation3.mmRiskLevel;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RiskLevel1Choice.mmObject();
		}
	};
	protected KYCCheckType1Choice knowYourCustomerCheckType;
	/**
	 * Specifies the type of due diligence checks carried out on the investor.
	 * For definitions of ordinary, simple and enhanced know your customer
	 * checks, local market regulations should be consulted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.KYCCheckType1Choice
	 * KYCCheckType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmKnowYourCustomerCheckType
	 * PersonProfile.mmKnowYourCustomerCheckType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KnowYourCstmrChckTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerCheckType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of due diligence checks carried out on the investor. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmKnowYourCustomerCheckType
	 * PartyProfileInformation5.mmKnowYourCustomerCheckType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmKnowYourCustomerCheckType
	 * PartyProfileInformation3.mmKnowYourCustomerCheckType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKnowYourCustomerCheckType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmKnowYourCustomerCheckType;
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "KnowYourCstmrChckTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on the investor. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmKnowYourCustomerCheckType);
			previousVersion_lazy = () -> PartyProfileInformation3.mmKnowYourCustomerCheckType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KYCCheckType1Choice.mmObject();
		}
	};
	protected DataBaseCheck1 knowYourCustomerDatabaseCheck;
	/**
	 * Specifies whether a customer has been checked in a Know Your Customer
	 * (KYC) database.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataBaseCheck1
	 * DataBaseCheck1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4
	 * PartyProfileInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KnowYourCstmrDBChck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDatabaseCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a customer has been checked in a Know Your Customer (KYC) database."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmKnowYourCustomerDatabaseCheck
	 * PartyProfileInformation5.mmKnowYourCustomerDatabaseCheck}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKnowYourCustomerDatabaseCheck = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyProfileInformation4.mmObject();
			isDerived = false;
			xmlTag = "KnowYourCstmrDBChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDatabaseCheck";
			definition = "Specifies whether a customer has been checked in a Know Your Customer (KYC) database.";
			nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmKnowYourCustomerDatabaseCheck);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataBaseCheck1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyProfileInformation4.mmCertificationIndicator, PartyProfileInformation4.mmValidatingParty, PartyProfileInformation4.mmCheckingParty, PartyProfileInformation4.mmResponsibleParty,
						PartyProfileInformation4.mmCertificateType, PartyProfileInformation4.mmCheckingDate, PartyProfileInformation4.mmCheckingFrequency, PartyProfileInformation4.mmNextRevisionDate, PartyProfileInformation4.mmSalaryRange,
						PartyProfileInformation4.mmSourceOfWealth, PartyProfileInformation4.mmCustomerConductClassification, PartyProfileInformation4.mmRiskLevel, PartyProfileInformation4.mmKnowYourCustomerCheckType,
						PartyProfileInformation4.mmKnowYourCustomerDatabaseCheck);
				trace_lazy = () -> PrivateCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyProfileInformation4";
				definition = "Information to support the Know Your Customer (KYC) processes.";
				nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation5.mmObject());
				previousVersion_lazy = () -> PartyProfileInformation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
	}

	public Max140Text getValidatingParty() {
		return validatingParty;
	}

	public void setValidatingParty(Max140Text validatingParty) {
		this.validatingParty = validatingParty;
	}

	public Max140Text getCheckingParty() {
		return checkingParty;
	}

	public void setCheckingParty(Max140Text checkingParty) {
		this.checkingParty = checkingParty;
	}

	public Max140Text getResponsibleParty() {
		return responsibleParty;
	}

	public void setResponsibleParty(Max140Text responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	public CertificationType1Choice getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(CertificationType1Choice certificateType) {
		this.certificateType = certificateType;
	}

	public ISODate getCheckingDate() {
		return checkingDate;
	}

	public void setCheckingDate(ISODate checkingDate) {
		this.checkingDate = checkingDate;
	}

	public EventFrequency1Code getCheckingFrequency() {
		return checkingFrequency;
	}

	public void setCheckingFrequency(EventFrequency1Code checkingFrequency) {
		this.checkingFrequency = checkingFrequency;
	}

	public ISODate getNextRevisionDate() {
		return nextRevisionDate;
	}

	public void setNextRevisionDate(ISODate nextRevisionDate) {
		this.nextRevisionDate = nextRevisionDate;
	}

	public Max35Text getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(Max35Text salaryRange) {
		this.salaryRange = salaryRange;
	}

	public Max140Text getSourceOfWealth() {
		return sourceOfWealth;
	}

	public void setSourceOfWealth(Max140Text sourceOfWealth) {
		this.sourceOfWealth = sourceOfWealth;
	}

	public CustomerConductClassification1Choice getCustomerConductClassification() {
		return customerConductClassification;
	}

	public void setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
	}

	public RiskLevel1Choice getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(RiskLevel1Choice riskLevel) {
		this.riskLevel = riskLevel;
	}

	public KYCCheckType1Choice getKnowYourCustomerCheckType() {
		return knowYourCustomerCheckType;
	}

	public void setKnowYourCustomerCheckType(KYCCheckType1Choice knowYourCustomerCheckType) {
		this.knowYourCustomerCheckType = knowYourCustomerCheckType;
	}

	public DataBaseCheck1 getKnowYourCustomerDatabaseCheck() {
		return knowYourCustomerDatabaseCheck;
	}

	public void setKnowYourCustomerDatabaseCheck(com.tools20022.repository.msg.DataBaseCheck1 knowYourCustomerDatabaseCheck) {
		this.knowYourCustomerDatabaseCheck = knowYourCustomerDatabaseCheck;
	}
}