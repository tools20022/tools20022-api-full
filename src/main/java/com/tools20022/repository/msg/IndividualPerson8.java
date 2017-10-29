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
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#Name
 * IndividualPerson8.Name}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#GivenName
 * IndividualPerson8.GivenName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#NamePrefix
 * IndividualPerson8.NamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#NameSuffix
 * IndividualPerson8.NameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#Gender
 * IndividualPerson8.Gender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#BirthDate
 * IndividualPerson8.BirthDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#SocialSecurityNumber
 * IndividualPerson8.SocialSecurityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#IndividualInvestorAddress
 * IndividualPerson8.IndividualInvestorAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#PrimaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#SecondaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#OtherIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#PrimaryIndividualInvestor
 * AccountHoldingInformationV02.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#SecondaryIndividualInvestor
 * AccountHoldingInformationV02.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#OtherIndividualInvestor
 * AccountHoldingInformationV02.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#PrimaryIndividualInvestor
 * AccountHoldingInformationV03.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#SecondaryIndividualInvestor
 * AccountHoldingInformationV03.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#OtherIndividualInvestor
 * AccountHoldingInformationV03.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#PrimaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#SecondaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#OtherIndividualInvestor
 * PEPOrISAOrPortfolioTransferConfirmationV02.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#PrimaryIndividualInvestor
 * PortfolioTransferConfirmationV03.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#SecondaryIndividualInvestor
 * PortfolioTransferConfirmationV03.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#OtherIndividualInvestor
 * PortfolioTransferConfirmationV03.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#PrimaryIndividualInvestor
 * PortfolioTransferConfirmationV04.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#SecondaryIndividualInvestor
 * PortfolioTransferConfirmationV04.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#OtherIndividualInvestor
 * PortfolioTransferConfirmationV04.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#PrimaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#SecondaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#OtherIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#PrimaryIndividualInvestor
 * PortfolioTransferInstructionV03.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#SecondaryIndividualInvestor
 * PortfolioTransferInstructionV03.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#OtherIndividualInvestor
 * PortfolioTransferInstructionV03.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#PrimaryIndividualInvestor
 * PortfolioTransferInstructionV04.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#SecondaryIndividualInvestor
 * PortfolioTransferInstructionV04.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#OtherIndividualInvestor
 * PortfolioTransferInstructionV04.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#PrimaryIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#SecondaryIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#OtherIndividualInvestor
 * RequestForPEPOrISAOrPortfolioInformationV01.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#PrimaryIndividualInvestor
 * AccountHoldingInformationRequestV02.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#SecondaryIndividualInvestor
 * AccountHoldingInformationRequestV02.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#OtherIndividualInvestor
 * AccountHoldingInformationRequestV02.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#PrimaryIndividualInvestor
 * AccountHoldingInformationRequestV03.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#SecondaryIndividualInvestor
 * AccountHoldingInformationRequestV03.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#OtherIndividualInvestor
 * AccountHoldingInformationRequestV03.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#PrimaryIndividualInvestor
 * AccountHoldingInformationV04.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#SecondaryIndividualInvestor
 * AccountHoldingInformationV04.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#OtherIndividualInvestor
 * AccountHoldingInformationV04.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#PrimaryIndividualInvestor
 * PortfolioTransferInstructionV05.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#SecondaryIndividualInvestor
 * PortfolioTransferInstructionV05.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#OtherIndividualInvestor
 * PortfolioTransferInstructionV05.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#PrimaryIndividualInvestor
 * PortfolioTransferConfirmationV05.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#SecondaryIndividualInvestor
 * PortfolioTransferConfirmationV05.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#OtherIndividualInvestor
 * PortfolioTransferConfirmationV05.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#PrimaryIndividualInvestor
 * PortfolioTransferConfirmationV06.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#SecondaryIndividualInvestor
 * PortfolioTransferConfirmationV06.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#OtherIndividualInvestor
 * PortfolioTransferConfirmationV06.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#PrimaryIndividualInvestor
 * PortfolioTransferInstructionV06.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#SecondaryIndividualInvestor
 * PortfolioTransferInstructionV06.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#OtherIndividualInvestor
 * PortfolioTransferInstructionV06.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#PrimaryIndividualInvestor
 * PortfolioTransferInstructionV07.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#SecondaryIndividualInvestor
 * PortfolioTransferInstructionV07.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#OtherIndividualInvestor
 * PortfolioTransferInstructionV07.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#PrimaryIndividualInvestor
 * AccountHoldingInformationV05.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#SecondaryIndividualInvestor
 * AccountHoldingInformationV05.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#OtherIndividualInvestor
 * AccountHoldingInformationV05.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#PrimaryIndividualInvestor
 * PortfolioTransferConfirmationV07.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#SecondaryIndividualInvestor
 * PortfolioTransferConfirmationV07.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#OtherIndividualInvestor
 * PortfolioTransferConfirmationV07.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#PrimaryIndividualInvestor
 * AccountHoldingInformationRequestV04.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#SecondaryIndividualInvestor
 * AccountHoldingInformationRequestV04.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#OtherIndividualInvestor
 * AccountHoldingInformationRequestV04.OtherIndividualInvestor}</li>
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
 * "IndividualPerson8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * </ul>
 */
public class IndividualPerson8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#BirthName
	 * PersonName.BirthName}</li>
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
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.BirthName;
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#GivenName
	 * PersonName.GivenName}</li>
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
	public static final MMMessageAttribute GivenName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.GivenName;
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#NamePrefix
	 * PersonName.NamePrefix}</li>
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
	public static final MMMessageAttribute NamePrefix = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.NamePrefix;
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#NameSuffix
	 * PersonName.NameSuffix}</li>
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
	public static final MMMessageAttribute NameSuffix = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.NameSuffix;
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, eg, qualification such as Doctor of Philosophy (PhD).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Person#Gender Person.Gender}
	 * </li>
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
	public static final MMMessageAttribute Gender = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.Gender;
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Person#BirthDate
	 * Person.BirthDate}</li>
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
	public static final MMMessageAttribute BirthDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.BirthDate;
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#SocialSecurityNumber
	 * PersonIdentification.SocialSecurityNumber}</li>
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
	public static final MMMessageAttribute SocialSecurityNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonIdentification.SocialSecurityNumber;
			isDerived = false;
			xmlTag = "SclSctyNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMMessageAssociationEnd IndividualInvestorAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IndividualPerson8.mmObject();
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			xmlTag = "IndvInvstrAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualInvestorAddress";
			definition = "Postal address of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PostalAddress1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson8.Name, com.tools20022.repository.msg.IndividualPerson8.GivenName, com.tools20022.repository.msg.IndividualPerson8.NamePrefix,
						com.tools20022.repository.msg.IndividualPerson8.NameSuffix, com.tools20022.repository.msg.IndividualPerson8.Gender, com.tools20022.repository.msg.IndividualPerson8.BirthDate,
						com.tools20022.repository.msg.IndividualPerson8.SocialSecurityNumber, com.tools20022.repository.msg.IndividualPerson8.IndividualInvestorAddress);
				trace_lazy = () -> Person.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV02.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.OtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV03.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.OtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.OtherIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.OtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.OtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.OtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV04.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV04.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.OtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.OtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.OtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.OtherIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.PrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.SecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.OtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.PrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.SecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.OtherIndividualInvestor);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson8";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			}
		});
		return mmObject_lazy.get();
	}
}