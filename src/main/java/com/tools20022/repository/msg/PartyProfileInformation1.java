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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.CertificateType1Code;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Information to support the Know Your Customer processes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificateTypeOrExtendedCertificateTypeRule
 * PartyProfileInformation1.mmCertificateTypeOrExtendedCertificateTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificationIndicator
 * PartyProfileInformation1.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmValidatingParty
 * PartyProfileInformation1.mmValidatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCheckingParty
 * PartyProfileInformation1.mmCheckingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmResponsibleParty
 * PartyProfileInformation1.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificateType
 * PartyProfileInformation1.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmExtendedCertificateType
 * PartyProfileInformation1.mmExtendedCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCheckingDate
 * PartyProfileInformation1.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCheckingFrequency
 * PartyProfileInformation1.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmNextRevisionDate
 * PartyProfileInformation1.mmNextRevisionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmSalaryRange
 * PartyProfileInformation1.mmSalaryRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmSourceOfWealth
 * PartyProfileInformation1.mmSourceOfWealth}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyProfileInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to support the Know Your Customer processes."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation2
 * PartyProfileInformation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PartyProfileInformation1 {

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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificationIndicator;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			maxOccurs = 1;
			minOccurs = 1;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValidatingPartyRole
	 * ValidatingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidatingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ValidatingPartyRole.mmObject();
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "VldtngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidatingParty";
			definition = "Identification of the person who validated the document.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CheckingPartyRole
	 * CheckingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CheckingPartyRole.mmObject();
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChckngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingParty";
			definition = "Identification of the person who checked the document.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ResponsiblePartyRole
	 * ResponsiblePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponsibleParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ResponsiblePartyRole.mmObject();
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Identification of the person who is responsible for the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CertificateType1Code certificateType;
	/**
	 * Identifies the type of certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateType1Code
	 * CertificateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificateType
	 * PrivateCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * definition} = "Identifies the type of certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificateType;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Identifies the type of certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificateType1Code.mmObject();
		}
	};
	protected Extended350Code extendedCertificateType;
	/**
	 * Identifies the type of certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificateType
	 * PrivateCertificate.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCertTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedCertificateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificateType;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "XtndedCertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCertificateType";
			definition = "Identifies the type of certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingDate;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChckngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheckingFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingFrequency;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChckngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextRevisionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmNextRevisionDate;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "NxtRvsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSalaryRange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSalaryRange;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "SlryRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryRange";
			definition = "Limits between which a person's salary is estimated.";
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
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSourceOfWealth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSourceOfWealth;
			componentContext_lazy = () -> PartyProfileInformation1.mmObject();
			isDerived = false;
			xmlTag = "SrcOfWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main source of revenue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Either CertificateType or ExtendedCertificateType must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1
	 * PartyProfileInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificateType
	 * PartyProfileInformation1.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmExtendedCertificateType
	 * PartyProfileInformation1.mmExtendedCertificateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateTypeOrExtendedCertificateTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CertificateType or ExtendedCertificateType must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmCertificateTypeOrExtendedCertificateTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateTypeOrExtendedCertificateTypeRule";
			definition = "Either CertificateType or ExtendedCertificateType must be present, but not both.";
			messageComponent_lazy = () -> PartyProfileInformation1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCertificateType, PartyProfileInformation1.mmExtendedCertificateType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCertificationIndicator, PartyProfileInformation1.mmValidatingParty, PartyProfileInformation1.mmCheckingParty, PartyProfileInformation1.mmResponsibleParty,
						PartyProfileInformation1.mmCertificateType, PartyProfileInformation1.mmExtendedCertificateType, PartyProfileInformation1.mmCheckingDate, PartyProfileInformation1.mmCheckingFrequency,
						PartyProfileInformation1.mmNextRevisionDate, PartyProfileInformation1.mmSalaryRange, PartyProfileInformation1.mmSourceOfWealth);
				trace_lazy = () -> PrivateCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyProfileInformation1";
				definition = "Information to support the Know Your Customer processes.";
				nextVersions_lazy = () -> Arrays.asList(PartyProfileInformation2.mmObject());
				xors_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCertificateTypeOrExtendedCertificateTypeRule);
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

	public CertificateType1Code getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(CertificateType1Code certificateType) {
		this.certificateType = certificateType;
	}

	public Extended350Code getExtendedCertificateType() {
		return extendedCertificateType;
	}

	public void setExtendedCertificateType(Extended350Code extendedCertificateType) {
		this.extendedCertificateType = extendedCertificateType;
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
}