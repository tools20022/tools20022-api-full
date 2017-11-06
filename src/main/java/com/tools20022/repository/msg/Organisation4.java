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
import com.tools20022.repository.choice.PartyIdentification4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PostalAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organised structure that is set up for a particular purpose, eg, a business,
 * government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#mmName
 * Organisation4.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#mmIdentification
 * Organisation4.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation4#mmPurpose
 * Organisation4.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxationCountry
 * Organisation4.mmTaxationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationCountry
 * Organisation4.mmRegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationDate
 * Organisation4.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxIdentificationNumber
 * Organisation4.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmNationalRegistrationNumber
 * Organisation4.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmCorporateInvestorAddress
 * Organisation4.mmCorporateInvestorAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPrimaryCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmSecondaryCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmOtherCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmPrimaryCorporateInvestor
 * AccountHoldingInformationV02.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmSecondaryCorporateInvestor
 * AccountHoldingInformationV02.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmOtherCorporateInvestor
 * AccountHoldingInformationV02.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmPrimaryCorporateInvestor
 * AccountHoldingInformationV03.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmSecondaryCorporateInvestor
 * AccountHoldingInformationV03.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmOtherCorporateInvestor
 * AccountHoldingInformationV03.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmPrimaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmSecondaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmOtherCorporateInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV03.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV03.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV03.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV04.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV04.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV04.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPrimaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmSecondaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmOtherCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV03.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV03.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV03.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV04.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV04.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV04.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmPrimaryCorporateInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmSecondaryCorporateInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmOtherCorporateInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmPrimaryCorporateInvestor
 * AccountHoldingInformationRequestV02.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmSecondaryCorporateInvestor
 * AccountHoldingInformationRequestV02.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmOtherCorporateInvestor
 * AccountHoldingInformationRequestV02.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPrimaryCorporateInvestor
 * AccountHoldingInformationRequestV03.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmSecondaryCorporateInvestor
 * AccountHoldingInformationRequestV03.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmOtherCorporateInvestor
 * AccountHoldingInformationRequestV03.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPrimaryCorporateInvestor
 * AccountHoldingInformationV04.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmSecondaryCorporateInvestor
 * AccountHoldingInformationV04.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmOtherCorporateInvestor
 * AccountHoldingInformationV04.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV05.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV05.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV05.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV05.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV05.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV05.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV06.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV06.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV06.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmPrimaryCorporateInvestor
 * PortfolioTransferInstructionV06.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmSecondaryCorporateInvestor
 * PortfolioTransferInstructionV06.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmOtherCorporateInvestor
 * PortfolioTransferInstructionV06.mmOtherCorporateInvestor}</li>
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
 * "Organisation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation21 Organisation21}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Organisation4 {

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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmName
	 * Organisation21.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification4Choice identification;
	/**
	 * Unique and unambiguous identifier for an organisation that is allocated
	 * by an institution, eg, Dun &amp; Bradstreet Identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice
	 * PartyIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * definition} =
	 * "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun &amp; Bradstreet Identification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmIdentification
	 * Organisation21.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun & Bradstreet Identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification4Choice.mmObject();
		}
	};
	protected Max35Text purpose;
	/**
	 * Purpose of the organisation, eg, charity.
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * definition} = "Purpose of the organisation, eg, charity."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation21#mmPurpose
	 * Organisation21.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmPurpose;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, eg, charity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmPurpose);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxationCountry
	 * Organisation21.mmTaxationCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of an organisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmTaxationCountry);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationCountry
	 * Organisation21.mmRegistrationCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmRegistrationCountry);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationDate
	 * Organisation21.mmRegistrationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmRegistrationDate;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmRegistrationDate);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxIdentificationNumber
	 * Organisation21.mmTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmTaxIdentificationNumber);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmNationalRegistrationNumber
	 * Organisation21.mmNationalRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationalRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "NtlRegnNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmNationalRegistrationNumber);
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
	 * {@linkplain com.tools20022.repository.msg.Organisation4 Organisation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmCorporateInvestorAddress
	 * Organisation21.mmCorporateInvestorAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateInvestorAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation4.mmObject();
			isDerived = false;
			xmlTag = "CorpInvstrAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateInvestorAddress";
			definition = "Postal address of a party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation21.mmCorporateInvestorAddress);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.Organisation4.mmName, com.tools20022.repository.msg.Organisation4.mmIdentification, com.tools20022.repository.msg.Organisation4.mmPurpose,
								com.tools20022.repository.msg.Organisation4.mmTaxationCountry, com.tools20022.repository.msg.Organisation4.mmRegistrationCountry, com.tools20022.repository.msg.Organisation4.mmRegistrationDate,
								com.tools20022.repository.msg.Organisation4.mmTaxIdentificationNumber, com.tools20022.repository.msg.Organisation4.mmNationalRegistrationNumber,
								com.tools20022.repository.msg.Organisation4.mmCorporateInvestorAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmOtherCorporateInvestor);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation4";
				definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
				nextVersions_lazy = () -> Arrays.asList(Organisation21.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getName() {
		return name;
	}

	public void setName(Max140Text name) {
		this.name = name;
	}

	public PartyIdentification4Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification4Choice identification) {
		this.identification = identification;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public void setPurpose(Max35Text purpose) {
		this.purpose = purpose;
	}

	public CountryCode getTaxationCountry() {
		return taxationCountry;
	}

	public void setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = taxationCountry;
	}

	public CountryCode getRegistrationCountry() {
		return registrationCountry;
	}

	public void setRegistrationCountry(CountryCode registrationCountry) {
		this.registrationCountry = registrationCountry;
	}

	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public Max35Text getNationalRegistrationNumber() {
		return nationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
	}

	public PostalAddress1 getCorporateInvestorAddress() {
		return corporateInvestorAddress;
	}

	public void setCorporateInvestorAddress(com.tools20022.repository.msg.PostalAddress1 corporateInvestorAddress) {
		this.corporateInvestorAddress = corporateInvestorAddress;
	}
}