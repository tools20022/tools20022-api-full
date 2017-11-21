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
import com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04;
import com.tools20022.repository.area.sese.AccountHoldingInformationV05;
import com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07;
import com.tools20022.repository.area.sese.PortfolioTransferInstructionV07;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Organised structure that is set up for a particular purpose, for example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmName
 * Organisation21.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmIdentification
 * Organisation21.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmPurpose
 * Organisation21.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxationCountry
 * Organisation21.mmTaxationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationCountry
 * Organisation21.mmRegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationDate
 * Organisation21.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxIdentificationNumber
 * Organisation21.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmNationalRegistrationNumber
 * Organisation21.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmCorporateInvestorAddress
 * Organisation21.mmCorporateInvestorAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV07.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV07.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV07.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPrimaryCorporateInvestor
 * AccountHoldingInformationV05.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmSecondaryCorporateInvestor
 * AccountHoldingInformationV05.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmOtherCorporateInvestor
 * AccountHoldingInformationV05.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV07.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV07.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV07.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPrimaryCorporateInvestor
 * AccountHoldingInformationRequestV04.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmSecondaryCorporateInvestor
 * AccountHoldingInformationRequestV04.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmOtherCorporateInvestor
 * AccountHoldingInformationRequestV04.mmOtherCorporateInvestor}</li>
 * </ul>
 * </li>
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
 * "Organisation21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation4
 * Organisation4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Organisation21", propOrder = {"name", "identification", "purpose", "taxationCountry", "registrationCountry", "registrationDate", "taxIdentificationNumber", "nationalRegistrationNumber", "corporateInvestorAddress"})
public class Organisation21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
	 * OrganisationIdentification.mmOrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmName
	 * Organisation4.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmOrganisationName;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			previousVersion_lazy = () -> Organisation4.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification72Choice identification;
	/**
	 * Unique and unambiguous identifier for the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier for the organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmIdentification
	 * Organisation4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the organisation.";
			previousVersion_lazy = () -> Organisation4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};
	protected Max35Text purpose;
	/**
	 * Purpose of the organisation, for example,, charity.
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
	 * Organisation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, for example,, charity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmPurpose
	 * Organisation4.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmPurpose;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, for example,, charity.";
			previousVersion_lazy = () -> Organisation4.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CountryCode taxationCountry;
	/**
	 * Country of taxation of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of taxation of an organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxationCountry
	 * Organisation4.mmTaxationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of an organisation.";
			previousVersion_lazy = () -> Organisation4.mmTaxationCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected CountryCode registrationCountry;
	/**
	 * Country in which the organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the organisation is registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationCountry
	 * Organisation4.mmRegistrationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			previousVersion_lazy = () -> Organisation4.mmRegistrationCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ISODate registrationDate;
	/**
	 * Date and time at which a given organisation was officially registered.
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
	 * Organisation.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationDate
	 * Organisation4.mmRegistrationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmRegistrationDate;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			previousVersion_lazy = () -> Organisation4.mmRegistrationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxIdentificationNumber
	 * Organisation4.mmTaxIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			previousVersion_lazy = () -> Organisation4.mmTaxIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text nationalRegistrationNumber;
	/**
	 * Number assigned by a national registration authority to an entity.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtlRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmNationalRegistrationNumber
	 * Organisation4.mmNationalRegistrationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationalRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "NtlRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			previousVersion_lazy = () -> Organisation4.mmNationalRegistrationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PostalAddress1 corporateInvestorAddress;
	/**
	 * Postal address of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpInvstrAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInvestorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmCorporateInvestorAddress
	 * Organisation4.mmCorporateInvestorAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateInvestorAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation21.mmObject();
			isDerived = false;
			xmlTag = "CorpInvstrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInvestorAddress";
			definition = "Postal address of a party.";
			previousVersion_lazy = () -> Organisation4.mmCorporateInvestorAddress;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Organisation21.mmName, Organisation21.mmIdentification, Organisation21.mmPurpose, Organisation21.mmTaxationCountry, Organisation21.mmRegistrationCountry,
						Organisation21.mmRegistrationDate, Organisation21.mmTaxIdentificationNumber, Organisation21.mmNationalRegistrationNumber, Organisation21.mmCorporateInvestorAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferInstructionV07.mmPrimaryCorporateInvestor, PortfolioTransferInstructionV07.mmSecondaryCorporateInvestor,
						PortfolioTransferInstructionV07.mmOtherCorporateInvestor, AccountHoldingInformationV05.mmPrimaryCorporateInvestor, AccountHoldingInformationV05.mmSecondaryCorporateInvestor,
						AccountHoldingInformationV05.mmOtherCorporateInvestor, PortfolioTransferConfirmationV07.mmPrimaryCorporateInvestor, PortfolioTransferConfirmationV07.mmSecondaryCorporateInvestor,
						PortfolioTransferConfirmationV07.mmOtherCorporateInvestor, AccountHoldingInformationRequestV04.mmPrimaryCorporateInvestor, AccountHoldingInformationRequestV04.mmSecondaryCorporateInvestor,
						AccountHoldingInformationRequestV04.mmOtherCorporateInvestor);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation21";
				definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
				previousVersion_lazy = () -> Organisation4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm", required = true)
	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	@XmlElement(name = "Id")
	public PartyIdentification72Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification72Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Purp")
	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "TaxtnCtry")
	public CountryCode getTaxationCountry() {
		return taxationCountry;
	}

	public void setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = taxationCountry;
	}

	@XmlElement(name = "RegnCtry")
	public CountryCode getRegistrationCountry() {
		return registrationCountry;
	}

	public void setRegistrationCountry(CountryCode registrationCountry) {
		this.registrationCountry = registrationCountry;
	}

	@XmlElement(name = "RegnDt")
	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@XmlElement(name = "TaxIdNb")
	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	@XmlElement(name = "NtlRegnNb")
	public Max35Text getNationalRegistrationNumber() {
		return nationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
	}

	@XmlElement(name = "CorpInvstrAdr", required = true)
	public PostalAddress1 getCorporateInvestorAddress() {
		return corporateInvestorAddress;
	}

	public void setCorporateInvestorAddress(com.tools20022.repository.msg.PostalAddress1 corporateInvestorAddress) {
		this.corporateInvestorAddress = corporateInvestorAddress;
	}
}