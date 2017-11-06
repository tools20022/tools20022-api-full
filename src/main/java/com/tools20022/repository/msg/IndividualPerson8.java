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
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PostalAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmName
 * IndividualPerson8.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmGivenName
 * IndividualPerson8.mmGivenName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmNamePrefix
 * IndividualPerson8.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmNameSuffix
 * IndividualPerson8.mmNameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmGender
 * IndividualPerson8.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmBirthDate
 * IndividualPerson8.mmBirthDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmSocialSecurityNumber
 * IndividualPerson8.mmSocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmIndividualInvestorAddress
 * IndividualPerson8.mmIndividualInvestorAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPrimaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmSecondaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmOtherIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV02.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV02.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmOtherIndividualInvestor
 * AccountHoldingInformationV02.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV03.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV03.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmOtherIndividualInvestor
 * AccountHoldingInformationV03.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmPrimaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmSecondaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmOtherIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV03.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV03.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV03.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV04.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV04.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV04.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPrimaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmSecondaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmOtherIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV03.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV03.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV03.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV04.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV04.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV04.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmPrimaryIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmSecondaryIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmOtherIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmPrimaryIndividualInvestor
 * AccountHoldingInformationRequestV02.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmSecondaryIndividualInvestor
 * AccountHoldingInformationRequestV02.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmOtherIndividualInvestor
 * AccountHoldingInformationRequestV02.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPrimaryIndividualInvestor
 * AccountHoldingInformationRequestV03.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmSecondaryIndividualInvestor
 * AccountHoldingInformationRequestV03.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmOtherIndividualInvestor
 * AccountHoldingInformationRequestV03.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV04.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV04.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmOtherIndividualInvestor
 * AccountHoldingInformationV04.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV05.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV05.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV05.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV05.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV05.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV05.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV06.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV06.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV06.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV06.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV06.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV06.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV07.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV07.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV07.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV05.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV05.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmOtherIndividualInvestor
 * AccountHoldingInformationV05.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV07.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV07.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV07.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPrimaryIndividualInvestor
 * AccountHoldingInformationRequestV04.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmSecondaryIndividualInvestor
 * AccountHoldingInformationRequestV04.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmOtherIndividualInvestor
 * AccountHoldingInformationRequestV04.mmOtherIndividualInvestor}</li>
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
 * "IndividualPerson8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * </ul>
 */
public class IndividualPerson8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text name;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmBirthName;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text givenName;
	/**
	 * First name of a person.
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGivenName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmGivenName;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected NamePrefix1Code namePrefix;
	/**
	 * Specifies the terms used to formally address a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the terms used to formally address a person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmNamePrefix;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	protected Max35Text nameSuffix;
	/**
	 * Additional information about a person that follows a person's name, eg,
	 * qualification such as Doctor of Philosophy (PhD).
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNameSuffix
	 * PersonName.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmSfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameSuffix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmNameSuffix;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected GenderCode gender;
	/**
	 * Specifies the gender of the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmGender
	 * Person.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the gender of the person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGender = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmGender;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GenderCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBirthDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmBirthDate;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text socialSecurityNumber;
	/**
	 * Number assigned by a social security agency.
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
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmSocialSecurityNumber
	 * PersonIdentification.mmSocialSecurityNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SclSctyNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a social security agency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSocialSecurityNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "SclSctyNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PostalAddress1 individualInvestorAddress;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvInvstrAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualInvestorAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualInvestorAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "IndvInvstrAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualInvestorAddress";
			definition = "Postal address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson8.mmName, com.tools20022.repository.msg.IndividualPerson8.mmGivenName, com.tools20022.repository.msg.IndividualPerson8.mmNamePrefix,
						com.tools20022.repository.msg.IndividualPerson8.mmNameSuffix, com.tools20022.repository.msg.IndividualPerson8.mmGender, com.tools20022.repository.msg.IndividualPerson8.mmBirthDate,
						com.tools20022.repository.msg.IndividualPerson8.mmSocialSecurityNumber, com.tools20022.repository.msg.IndividualPerson8.mmIndividualInvestorAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmOtherIndividualInvestor);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson8";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public Max35Text getGivenName() {
		return givenName;
	}

	public void setGivenName(Max35Text givenName) {
		this.givenName = givenName;
	}

	public NamePrefix1Code getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
	}

	public Max35Text getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public GenderCode getGender() {
		return gender;
	}

	public void setGender(GenderCode gender) {
		this.gender = gender;
	}

	public ISODate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
	}

	public Max35Text getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public PostalAddress1 getIndividualInvestorAddress() {
		return individualInvestorAddress;
	}

	public void setIndividualInvestorAddress(com.tools20022.repository.msg.PostalAddress1 individualInvestorAddress) {
		this.individualInvestorAddress = individualInvestorAddress;
	}
}