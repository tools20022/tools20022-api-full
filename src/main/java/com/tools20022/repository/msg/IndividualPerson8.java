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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmPrimaryIndividualInvestor
 * PortfolioTransferInstructionV08.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmSecondaryIndividualInvestor
 * PortfolioTransferInstructionV08.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmOtherIndividualInvestor
 * PortfolioTransferInstructionV08.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV08.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV08.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV08.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV06.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV06.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmOtherIndividualInvestor
 * AccountHoldingInformationV06.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPrimaryIndividualInvestor
 * AccountHoldingInformationRequestV05.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmSecondaryIndividualInvestor
 * AccountHoldingInformationRequestV05.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmOtherIndividualInvestor
 * AccountHoldingInformationRequestV05.mmOtherIndividualInvestor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSocialSecurityNumberGuideline#forIndividualPerson8
 * ConstraintSocialSecurityNumberGuideline.forIndividualPerson8}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPerson8", propOrder = {"name", "givenName", "namePrefix", "nameSuffix", "gender", "birthDate", "socialSecurityNumber", "individualInvestorAddress"})
public class IndividualPerson8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm", required = true)
	protected Max35Text name;
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
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "GvnNm", required = true)
	protected Max35Text givenName;
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
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}
	};
	@XmlElement(name = "NmSfx")
	protected Max35Text nameSuffix;
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
	 * "Additional information about a person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameSuffix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNameSuffix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Gndr")
	protected GenderCode gender;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Person.mmGender;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
	@XmlElement(name = "BirthDt")
	protected ISODate birthDate;
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
			businessElementTrace_lazy = () -> Person.mmBirthDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SclSctyNb")
	protected Max35Text socialSecurityNumber;
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
			businessElementTrace_lazy = () -> PersonIdentification.mmSocialSecurityNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "SclSctyNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityNumber";
			definition = "Number assigned by a social security agency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "IndvInvstrAdr", required = true)
	protected PostalAddress1 individualInvestorAddress;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
			isDerived = false;
			xmlTag = "IndvInvstrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				messageBuildingBlock_lazy = () -> Arrays.asList(PEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor, PEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor,
						PEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor, AccountHoldingInformationV02.mmPrimaryIndividualInvestor, AccountHoldingInformationV02.mmSecondaryIndividualInvestor,
						AccountHoldingInformationV02.mmOtherIndividualInvestor, AccountHoldingInformationV03.mmPrimaryIndividualInvestor, AccountHoldingInformationV03.mmSecondaryIndividualInvestor,
						AccountHoldingInformationV03.mmOtherIndividualInvestor, PEPOrISAOrPortfolioTransferConfirmationV02.mmPrimaryIndividualInvestor, PEPOrISAOrPortfolioTransferConfirmationV02.mmSecondaryIndividualInvestor,
						PEPOrISAOrPortfolioTransferConfirmationV02.mmOtherIndividualInvestor, PortfolioTransferConfirmationV03.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV03.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV03.mmOtherIndividualInvestor, PortfolioTransferConfirmationV04.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV04.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV04.mmOtherIndividualInvestor, PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryIndividualInvestor, PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryIndividualInvestor,
						PEPOrISAOrPortfolioTransferInstructionV02.mmOtherIndividualInvestor, PortfolioTransferInstructionV03.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV03.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV03.mmOtherIndividualInvestor, PortfolioTransferInstructionV04.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV04.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV04.mmOtherIndividualInvestor, RequestForPEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor, RequestForPEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor,
						RequestForPEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor, AccountHoldingInformationRequestV02.mmPrimaryIndividualInvestor, AccountHoldingInformationRequestV02.mmSecondaryIndividualInvestor,
						AccountHoldingInformationRequestV02.mmOtherIndividualInvestor, AccountHoldingInformationRequestV03.mmPrimaryIndividualInvestor, AccountHoldingInformationRequestV03.mmSecondaryIndividualInvestor,
						AccountHoldingInformationRequestV03.mmOtherIndividualInvestor, AccountHoldingInformationV04.mmPrimaryIndividualInvestor, AccountHoldingInformationV04.mmSecondaryIndividualInvestor,
						AccountHoldingInformationV04.mmOtherIndividualInvestor, PortfolioTransferInstructionV05.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV05.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV05.mmOtherIndividualInvestor, PortfolioTransferConfirmationV05.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV05.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV05.mmOtherIndividualInvestor, PortfolioTransferConfirmationV06.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV06.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV06.mmOtherIndividualInvestor, PortfolioTransferInstructionV06.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV06.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV06.mmOtherIndividualInvestor, PortfolioTransferInstructionV07.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV07.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV07.mmOtherIndividualInvestor, AccountHoldingInformationV05.mmPrimaryIndividualInvestor, AccountHoldingInformationV05.mmSecondaryIndividualInvestor,
						AccountHoldingInformationV05.mmOtherIndividualInvestor, PortfolioTransferConfirmationV07.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV07.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV07.mmOtherIndividualInvestor, AccountHoldingInformationRequestV04.mmPrimaryIndividualInvestor, AccountHoldingInformationRequestV04.mmSecondaryIndividualInvestor,
						AccountHoldingInformationRequestV04.mmOtherIndividualInvestor, PortfolioTransferInstructionV08.mmPrimaryIndividualInvestor, PortfolioTransferInstructionV08.mmSecondaryIndividualInvestor,
						PortfolioTransferInstructionV08.mmOtherIndividualInvestor, PortfolioTransferConfirmationV08.mmPrimaryIndividualInvestor, PortfolioTransferConfirmationV08.mmSecondaryIndividualInvestor,
						PortfolioTransferConfirmationV08.mmOtherIndividualInvestor, AccountHoldingInformationV06.mmPrimaryIndividualInvestor, AccountHoldingInformationV06.mmSecondaryIndividualInvestor,
						AccountHoldingInformationV06.mmOtherIndividualInvestor, AccountHoldingInformationRequestV05.mmPrimaryIndividualInvestor, AccountHoldingInformationRequestV05.mmSecondaryIndividualInvestor,
						AccountHoldingInformationRequestV05.mmOtherIndividualInvestor);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSocialSecurityNumberGuideline.forIndividualPerson8);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson8";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public IndividualPerson8 setName(Max35Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Max35Text getGivenName() {
		return givenName;
	}

	public IndividualPerson8 setGivenName(Max35Text givenName) {
		this.givenName = Objects.requireNonNull(givenName);
		return this;
	}

	public Optional<NamePrefix1Code> getNamePrefix() {
		return namePrefix == null ? Optional.empty() : Optional.of(namePrefix);
	}

	public IndividualPerson8 setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Optional<Max35Text> getNameSuffix() {
		return nameSuffix == null ? Optional.empty() : Optional.of(nameSuffix);
	}

	public IndividualPerson8 setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = nameSuffix;
		return this;
	}

	public Optional<GenderCode> getGender() {
		return gender == null ? Optional.empty() : Optional.of(gender);
	}

	public IndividualPerson8 setGender(GenderCode gender) {
		this.gender = gender;
		return this;
	}

	public Optional<ISODate> getBirthDate() {
		return birthDate == null ? Optional.empty() : Optional.of(birthDate);
	}

	public IndividualPerson8 setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public Optional<Max35Text> getSocialSecurityNumber() {
		return socialSecurityNumber == null ? Optional.empty() : Optional.of(socialSecurityNumber);
	}

	public IndividualPerson8 setSocialSecurityNumber(Max35Text socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
		return this;
	}

	public PostalAddress1 getIndividualInvestorAddress() {
		return individualInvestorAddress;
	}

	public IndividualPerson8 setIndividualInvestorAddress(com.tools20022.repository.msg.PostalAddress1 individualInvestorAddress) {
		this.individualInvestorAddress = Objects.requireNonNull(individualInvestorAddress);
		return this;
	}
}