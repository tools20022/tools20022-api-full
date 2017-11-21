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
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.InvestmentAccountService;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson9#mmName
 * IndividualPerson9.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson9#mmBirthDate
 * IndividualPerson9.mmBirthDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmCountryAndResidentialStatus
 * IndividualPerson9.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmBeneficiaryCertificationCompletion
 * IndividualPerson9.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmOtherIdentification
 * IndividualPerson9.mmOtherIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualPerson9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson31
 * IndividualPerson31}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IndividualPerson9", propOrder = {"name", "birthDate", "countryAndResidentialStatus", "beneficiaryCertificationCompletion", "otherIdentification"})
public class IndividualPerson9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson31#mmName
	 * IndividualPerson31.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> IndividualPerson9.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODate birthDate;
	/**
	 * Date on which a person is born.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmBirthDate
	 * Person.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is born."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmBirthDate
	 * IndividualPerson31.mmBirthDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBirthDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmBirthDate;
			componentContext_lazy = () -> IndividualPerson9.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmBirthDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CountryAndResidentialStatusType1 countryAndResidentialStatus;
	/**
	 * Country and residential status of an individual, for example,
	 * non-pernament resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
	 * CountryAndResidentialStatusType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
	 * Person.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryAndResdtlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryAndResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country and residential status of an individual, for example, non-pernament resident."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmCountryAndResidentialStatus
	 * IndividualPerson31.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryAndResidentialStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> IndividualPerson9.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of an individual, for example, non-pernament resident.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmCountryAndResidentialStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CountryAndResidentialStatusType1.mmObject();
		}
	};
	protected BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion;
	/**
	 * Beneficial owner or its designated agent certifies that it complies with
	 * any holding or investment restrictions or requirements of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationCompletion
	 * InvestmentAccountService.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryCertfctnCmpltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmBeneficiaryCertificationCompletion
	 * IndividualPerson31.mmBeneficiaryCertificationCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficiaryCertificationCompletion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmBeneficiaryCertificationCompletion;
			componentContext_lazy = () -> IndividualPerson9.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCertfctnCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmBeneficiaryCertificationCompletion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BeneficiaryCertificationCompletion1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification11> otherIdentification;
	/**
	 * Alternative identification, for example, national registration
	 * identification number, passport number, or an account number used to
	 * further identify the beneficial owner, for example, a Central Provident
	 * Fund (CFP) account as required for Singapore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification11
	 * GenericIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative identification, for example, national registration identification number, passport number, or an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmOtherIdentification
	 * IndividualPerson31.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> IndividualPerson9.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, or an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmOtherIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification11.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IndividualPerson9.mmName, IndividualPerson9.mmBirthDate, IndividualPerson9.mmCountryAndResidentialStatus, IndividualPerson9.mmBeneficiaryCertificationCompletion,
						IndividualPerson9.mmOtherIdentification);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson9";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				nextVersions_lazy = () -> Arrays.asList(IndividualPerson31.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm")
	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	@XmlElement(name = "BirthDt")
	public ISODate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
	}

	@XmlElement(name = "CtryAndResdtlSts")
	public CountryAndResidentialStatusType1 getCountryAndResidentialStatus() {
		return countryAndResidentialStatus;
	}

	public void setCountryAndResidentialStatus(com.tools20022.repository.msg.CountryAndResidentialStatusType1 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
	}

	@XmlElement(name = "BnfcryCertfctnCmpltn")
	public BeneficiaryCertificationCompletion1Code getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion;
	}

	public void setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = beneficiaryCertificationCompletion;
	}

	@XmlElement(name = "OthrId")
	public List<GenericIdentification11> getOtherIdentification() {
		return otherIdentification;
	}

	public void setOtherIdentification(List<com.tools20022.repository.msg.GenericIdentification11> otherIdentification) {
		this.otherIdentification = otherIdentification;
	}
}