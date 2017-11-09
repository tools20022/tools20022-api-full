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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.codeset.ERISAEligibilityCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of an individual or entity that is ultimately entitled to the
 * benefit of income and rights in a security, as opposed to a nominal or legal
 * owner.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BeneficialOwner" src="doc-files/BeneficialOwner.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice
 * BeneficiaryCertificationType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice
 * BeneficiaryCertificationType4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType6Choice
 * BeneficiaryCertificationType6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType8Choice
 * BeneficiaryCertificationType8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice
 * BeneficiaryCertificationType1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice
 * BeneficiaryCertificationType3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType5Choice
 * BeneficiaryCertificationType5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice
 * BeneficiaryCertificationType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
 * BeneficiaryCertificationType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner1
 * BeneficialOwner1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
 * BeneficiaryInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
 * BeneficiaryInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner2
 * BeneficialOwner2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice
 * BeneficiaryCertificationType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice
 * BeneficiaryCertificationType10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType11Choice
 * BeneficiaryCertificationType11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType12Choice
 * BeneficiaryCertificationType12Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
 * Country.mmCountryForBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmBeneficiary
 * AccountParties2.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmBeneficiary
 * AccountParties5.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmBeneficiary
 * AccountParties6.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmBeneficiary
 * AccountParties3.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmBeneficiary
 * AccountParties4.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmBeneficiary
 * AccountParties7.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmOwnerIdentification
 * PartyIdentification33.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmOwnerIdentification
 * PartyIdentification34.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmOwnerIdentification
 * PartyIdentification50.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmOwnerIdentification
 * PartyIdentification51.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmOwnerIdentification
 * PartyIdentification56.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmOwnerIdentification
 * PartyIdentification57.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#mmTradeBeneficiaryParty
 * ConfirmationParties3.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmTradeBeneficiaryParty
 * ConfirmationParties4.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmTradeBeneficiaryParty
 * ConfirmationParties2.mmTradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmBeneficialOwnerDetails
 * CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmBeneficiary
 * AccountParties9.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmBeneficiary
 * AccountParties8.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#mmBeneficiary
 * AccountParties11.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#mmBeneficiary
 * AccountParties10.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#mmBeneficiary
 * AccountParties12.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmBeneficialOwner
 * SafekeepingAccount5.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmBeneficialOwner
 * AccountSubLevel1.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmBeneficialOwner
 * AccountSubLevel4.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmBeneficialOwner
 * AccountSubLevel5.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmBeneficialOwner
 * AccountSubLevel2.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmBeneficialOwner
 * AccountSubLevel3.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmBeneficialOwner
 * AccountSubLevel6.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmBeneficialOwner
 * AccountSubLevel7.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmBeneficialOwner
 * AccountSubLevel8.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#mmBeneficialOwner
 * AccountSubLevel9.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmOwnerIdentification
 * PartyIdentification93.mmOwnerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmBeneficiary
 * AccountParties13.mmBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#mmBeneficiary
 * AccountParties14.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmOwnerIdentification
 * PartyIdentification101.mmOwnerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmBeneficiary
 * AccountParties15.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmBeneficialOwner
 * SafekeepingAccount7.mmBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmBeneficiary
 * AccountParties16.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBeneficialOwner
 * AccountSubLevel15.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmBeneficialOwner
 * AccountSubLevel16.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBeneficialOwner
 * AccountSubLevel18.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#mmBeneficialOwner
 * AccountSubLevel19.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmBeneficialOwner
 * AccountSubLevel11.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmBeneficialOwner
 * AccountSubLevel12.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmBeneficialOwner
 * AccountSubLevel17.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBeneficialOwner
 * AccountSubLevel13.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmBeneficialOwner
 * AccountSubLevel14.mmBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
 * BeneficialOwner.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
 * BeneficialOwner.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
 * BeneficialOwner.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationFormat
 * BeneficialOwner.mmCertificationFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISAEligibility
 * BeneficialOwner.mmERISAEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISARate
 * BeneficialOwner.mmERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmBenefitPlanDeclarationIndicator
 * BeneficialOwner.mmBenefitPlanDeclarationIndicator}</li>
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
 * "BeneficialOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner."
 * </li>
 * </ul>
 */
public class BeneficialOwner extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BeneficiaryCertificationTypeCode certificationType;
	/**
	 * Type of certification which is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice#mmCode
	 * BeneficiaryCertificationType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice#mmProprietary
	 * BeneficiaryCertificationType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmCertificationType
	 * PartyIdentification33.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice#mmCode
	 * BeneficiaryCertificationType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice#mmProprietary
	 * BeneficiaryCertificationType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmCertificationType
	 * PartyIdentification34.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmCertificationType
	 * PartyIdentification50.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmCertificationType
	 * PartyIdentification51.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType6Choice#mmCode
	 * BeneficiaryCertificationType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType6Choice#mmProprietary
	 * BeneficiaryCertificationType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmCertificationType
	 * PartyIdentification56.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType8Choice#mmCode
	 * BeneficiaryCertificationType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType8Choice#mmProprietary
	 * BeneficiaryCertificationType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmCertificationType
	 * PartyIdentification57.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice#mmCode
	 * BeneficiaryCertificationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice#mmProprietary
	 * BeneficiaryCertificationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmCertificationType
	 * CorporateActionOption10.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice#mmCode
	 * BeneficiaryCertificationType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice#mmProprietary
	 * BeneficiaryCertificationType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmCertificationType
	 * CorporateActionOption15.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmCertificationType
	 * CorporateActionOption20.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmCertificationType
	 * CorporateActionOption32.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType5Choice#mmCode
	 * BeneficiaryCertificationType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType5Choice#mmProprietary
	 * BeneficiaryCertificationType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmCertificationBreakdownType
	 * CorporateActionOption35.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice#mmCode
	 * BeneficiaryCertificationType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice#mmProprietary
	 * BeneficiaryCertificationType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmCertificationBreakdownType
	 * CorporateActionOption44.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmCertificationBreakdownType
	 * CorporateActionOption52.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmCertificationBreakdownType
	 * CorporateActionOption55.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmCertificationType
	 * CorporateAction3.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmCertificationType
	 * CorporateActionOption3.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmCertificationType
	 * CorporateAction4.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmCertificationType
	 * CorporateActionOption17.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationType
	 * CorporateAction5.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCertificationType
	 * CorporateActionOption19.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmCertificationType
	 * CorporateAction6.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmCertificationType
	 * CorporateActionOption34.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmCertificationType
	 * CorporateAction7.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmCertificationBreakdownType
	 * CorporateActionOption36.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmCertificationType
	 * CorporateAction8.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmCertificationBreakdownType
	 * CorporateActionOption45.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCertificationType
	 * CorporateAction10.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmCertificationBreakdownType
	 * CorporateActionOption51.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmCertificationType
	 * CorporateAction11.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmCertificationBreakdownType
	 * CorporateActionOption56.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmCode
	 * BeneficiaryCertificationType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmProprietary
	 * BeneficiaryCertificationType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationType
	 * CorporateAction2.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationType
	 * CorporateActionOption1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationType
	 * BeneficialOwner1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationType
	 * CorporateActionAdditionalInformation1.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmCertificationBreakdownType
	 * CorporateActionOption100.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmCertificationBreakdownType
	 * CorporateActionOption101.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCertificationType
	 * CorporateAction12.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCertificationBreakdownType
	 * CorporateActionOption108.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmCertificationBreakdownType
	 * CorporateActionOption106.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmCertificationType
	 * CorporateAction17.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationType
	 * BeneficialOwner2.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#mmCode
	 * BeneficiaryCertificationType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#mmProprietary
	 * BeneficiaryCertificationType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmCertificationType
	 * PartyIdentification93.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmCertificationBreakdownType
	 * CorporateActionOption115.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCertificationBreakdownType
	 * CorporateActionOption114.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmCertificationType
	 * CorporateAction31.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#mmCode
	 * BeneficiaryCertificationType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#mmProprietary
	 * BeneficiaryCertificationType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmCertificationBreakdownType
	 * CorporateActionOption125.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmCertificationType
	 * PartyIdentification101.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmCertificationBreakdownType
	 * CorporateActionOption127.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmCertificationType
	 * CorporateAction40.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType11Choice#mmCode
	 * BeneficiaryCertificationType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType11Choice#mmProprietary
	 * BeneficiaryCertificationType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType12Choice#mmCode
	 * BeneficiaryCertificationType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType12Choice#mmProprietary
	 * BeneficiaryCertificationType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCertificationBreakdownType
	 * CorporateActionOption130.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmCertificationBreakdownType
	 * CorporateActionOption129.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmCertificationBreakdownType
	 * CorporateActionOption135.mmCertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmCertificationBreakdownType
	 * CorporateActionOption133.mmCertificationBreakdownType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficiaryCertificationType2Choice.mmCode, BeneficiaryCertificationType2Choice.mmProprietary, PartyIdentification33.mmCertificationType, BeneficiaryCertificationType4Choice.mmCode,
					BeneficiaryCertificationType4Choice.mmProprietary, PartyIdentification34.mmCertificationType, PartyIdentification50.mmCertificationType, PartyIdentification51.mmCertificationType,
					BeneficiaryCertificationType6Choice.mmCode, BeneficiaryCertificationType6Choice.mmProprietary, PartyIdentification56.mmCertificationType, BeneficiaryCertificationType8Choice.mmCode,
					BeneficiaryCertificationType8Choice.mmProprietary, PartyIdentification57.mmCertificationType, BeneficiaryCertificationType1Choice.mmCode, BeneficiaryCertificationType1Choice.mmProprietary,
					CorporateActionOption10.mmCertificationType, BeneficiaryCertificationType3Choice.mmCode, BeneficiaryCertificationType3Choice.mmProprietary, CorporateActionOption15.mmCertificationType,
					CorporateActionOption20.mmCertificationType, CorporateActionOption32.mmCertificationType, BeneficiaryCertificationType5Choice.mmCode, BeneficiaryCertificationType5Choice.mmProprietary,
					CorporateActionOption35.mmCertificationBreakdownType, BeneficiaryCertificationType7Choice.mmCode, BeneficiaryCertificationType7Choice.mmProprietary, CorporateActionOption44.mmCertificationBreakdownType,
					CorporateActionOption52.mmCertificationBreakdownType, CorporateActionOption55.mmCertificationBreakdownType, CorporateAction3.mmCertificationType, CorporateActionOption3.mmCertificationType,
					CorporateAction4.mmCertificationType, CorporateActionOption17.mmCertificationType, CorporateAction5.mmCertificationType, CorporateActionOption19.mmCertificationType, CorporateAction6.mmCertificationType,
					CorporateActionOption34.mmCertificationType, CorporateAction7.mmCertificationType, CorporateActionOption36.mmCertificationBreakdownType, CorporateAction8.mmCertificationType,
					CorporateActionOption45.mmCertificationBreakdownType, CorporateAction10.mmCertificationType, CorporateActionOption51.mmCertificationBreakdownType, CorporateAction11.mmCertificationType,
					CorporateActionOption56.mmCertificationBreakdownType, BeneficiaryCertificationType1FormatChoice.mmCode, BeneficiaryCertificationType1FormatChoice.mmProprietary, CorporateAction2.mmCertificationType,
					CorporateActionOption1.mmCertificationType, BeneficialOwner1.mmCertificationType, CorporateActionAdditionalInformation1.mmCertificationType, CorporateActionOption100.mmCertificationBreakdownType,
					CorporateActionOption101.mmCertificationBreakdownType, CorporateAction12.mmCertificationType, CorporateActionOption108.mmCertificationBreakdownType, CorporateActionOption106.mmCertificationBreakdownType,
					CorporateAction17.mmCertificationType, BeneficialOwner2.mmCertificationType, BeneficiaryCertificationType9Choice.mmCode, BeneficiaryCertificationType9Choice.mmProprietary, PartyIdentification93.mmCertificationType,
					CorporateActionOption115.mmCertificationBreakdownType, CorporateActionOption114.mmCertificationBreakdownType, CorporateAction31.mmCertificationType, BeneficiaryCertificationType10Choice.mmCode,
					BeneficiaryCertificationType10Choice.mmProprietary, CorporateActionOption125.mmCertificationBreakdownType, PartyIdentification101.mmCertificationType, CorporateActionOption127.mmCertificationBreakdownType,
					CorporateAction40.mmCertificationType, BeneficiaryCertificationType11Choice.mmCode, BeneficiaryCertificationType11Choice.mmProprietary, BeneficiaryCertificationType12Choice.mmCode,
					BeneficiaryCertificationType12Choice.mmProprietary, CorporateActionOption130.mmCertificationBreakdownType, CorporateActionOption129.mmCertificationBreakdownType, CorporateActionOption135.mmCertificationBreakdownType,
					CorporateActionOption133.mmCertificationBreakdownType);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
		}
	};
	protected Country nonDomicileCountry;
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
	 * Country.mmCountryForBeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmNonDomicileCountry
	 * CorporateActionOption10.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmNonDomicileCountry
	 * CorporateActionOption15.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmNonDomicileCountry
	 * CorporateActionOption20.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmNonDomicileCountry
	 * CorporateActionOption32.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmNonDomicileCountry
	 * CorporateActionOption35.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmNonDomicileCountry
	 * CorporateActionOption44.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmNonDomicileCountry
	 * CorporateActionOption52.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmNonDomicileCountry
	 * CorporateActionOption55.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmNonDomicileCountry
	 * CorporateActionOption3.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmNonDomicileCountry
	 * CorporateActionOption17.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmNonDomicileCountry
	 * CorporateActionOption19.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmNonDomicileCountry
	 * CorporateActionOption34.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmNonDomicileCountry
	 * CorporateActionOption36.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmNonDomicileCountry
	 * CorporateActionOption45.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmNonDomicileCountry
	 * CorporateActionOption51.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmNonDomicileCountry
	 * CorporateActionOption56.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNonDomicileCountry
	 * BeneficialOwner1.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmNonDomicileCountry
	 * CorporateActionOption100.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmNonDomicileCountry
	 * CorporateActionOption101.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmNonDomicileCountry
	 * CorporateActionOption108.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmNonDomicileCountry
	 * CorporateActionOption106.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNonDomicileCountry
	 * BeneficialOwner2.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmNonDomicileCountry
	 * CorporateActionOption115.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmNonDomicileCountry
	 * CorporateActionOption114.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmNonDomicileCountry
	 * CorporateActionOption125.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmNonDomicileCountry
	 * CorporateActionOption127.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmNonDomicileCountry
	 * CorporateActionOption130.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmNonDomicileCountry
	 * CorporateActionOption129.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmNonDomicileCountry
	 * CorporateActionOption135.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmNonDomicileCountry
	 * CorporateActionOption133.mmNonDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNonDomicileCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmNonDomicileCountry, CorporateActionOption15.mmNonDomicileCountry, CorporateActionOption20.mmNonDomicileCountry, CorporateActionOption32.mmNonDomicileCountry,
					CorporateActionOption35.mmNonDomicileCountry, CorporateActionOption44.mmNonDomicileCountry, CorporateActionOption52.mmNonDomicileCountry, CorporateActionOption55.mmNonDomicileCountry,
					CorporateActionOption3.mmNonDomicileCountry, CorporateActionOption17.mmNonDomicileCountry, CorporateActionOption19.mmNonDomicileCountry, CorporateActionOption34.mmNonDomicileCountry,
					CorporateActionOption36.mmNonDomicileCountry, CorporateActionOption45.mmNonDomicileCountry, CorporateActionOption51.mmNonDomicileCountry, CorporateActionOption56.mmNonDomicileCountry,
					BeneficialOwner1.mmNonDomicileCountry, CorporateActionOption100.mmNonDomicileCountry, CorporateActionOption101.mmNonDomicileCountry, CorporateActionOption108.mmNonDomicileCountry,
					CorporateActionOption106.mmNonDomicileCountry, BeneficialOwner2.mmNonDomicileCountry, CorporateActionOption115.mmNonDomicileCountry, CorporateActionOption114.mmNonDomicileCountry,
					CorporateActionOption125.mmNonDomicileCountry, CorporateActionOption127.mmNonDomicileCountry, CorporateActionOption130.mmNonDomicileCountry, CorporateActionOption129.mmNonDomicileCountry,
					CorporateActionOption135.mmNonDomicileCountry, CorporateActionOption133.mmNonDomicileCountry);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCountryForBeneficialOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected YesNoIndicator certificationIndicator;
	/**
	 * Indicates whether or not certification is required from the account
	 * owner, for instance a certification is required to participate to a
	 * corporate action event.<br>
	 * Y: certification required <br>
	 * N: no certification required
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmCertificationIndicator
	 * CorporateActionOption10.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmCertificationIndicator
	 * CorporateActionOption15.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmCertificationIndicator
	 * CorporateActionOption20.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmCertificationIndicator
	 * CorporateActionOption32.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmCertificationBreakdownIndicator
	 * CorporateActionOption35.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmCertificationBreakdownIndicator
	 * CorporateActionOption44.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmCertificationBreakdownIndicator
	 * CorporateActionOption52.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmCertificationBreakdownIndicator
	 * CorporateActionOption55.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmCertificationRequiredIndicator
	 * CorporateAction3.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmCertificationIndicator
	 * CorporateActionOption3.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmCertificationRequiredIndicator
	 * CorporateAction4.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmCertificationIndicator
	 * CorporateActionOption17.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationRequiredIndicator
	 * CorporateAction5.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCertificationIndicator
	 * CorporateActionOption19.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmCertificationRequiredIndicator
	 * CorporateAction6.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmCertificationIndicator
	 * CorporateActionOption34.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmCertificationBreakdownIndicator
	 * CorporateAction7.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmCertificationBreakdownIndicator
	 * CorporateActionOption36.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmCertificationBreakdownIndicator
	 * CorporateAction8.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmCertificationBreakdownIndicator
	 * CorporateActionOption45.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCertificationBreakdownIndicator
	 * CorporateAction10.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmCertificationBreakdownIndicator
	 * CorporateActionOption51.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmCertificationBreakdownIndicator
	 * CorporateAction11.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmCertificationBreakdownIndicator
	 * CorporateActionOption56.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCertificationRequiredIndicator
	 * CorporateAction2.mmCertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmCertificationIndicator
	 * CorporateActionOption1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationIndicator
	 * BeneficialOwner1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationIndicator
	 * CorporateActionAdditionalInformation1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmCertificationBreakdownIndicator
	 * CorporateActionOption100.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmCertificationBreakdownIndicator
	 * CorporateActionOption101.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCertificationBreakdownIndicator
	 * CorporateAction12.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCertificationBreakdownIndicator
	 * CorporateActionOption108.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmCertificationBreakdownIndicator
	 * CorporateActionOption106.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmCertificationBreakdownIndicator
	 * CorporateAction17.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationIndicator
	 * BeneficialOwner2.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmCertificationBreakdownIndicator
	 * CorporateActionOption115.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCertificationBreakdownIndicator
	 * CorporateActionOption114.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmCertificationBreakdownIndicator
	 * CorporateAction31.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmCertificationBreakdownIndicator
	 * CorporateActionOption125.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmCertificationBreakdownIndicator
	 * CorporateActionOption127.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmCertificationBreakdownIndicator
	 * CorporateAction40.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCertificationBreakdownIndicator
	 * CorporateActionOption130.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmCertificationBreakdownIndicator
	 * CorporateActionOption129.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmCertificationBreakdownIndicator
	 * CorporateActionOption135.mmCertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmCertificationBreakdownIndicator
	 * CorporateActionOption133.mmCertificationBreakdownIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmCertificationIndicator, CorporateActionOption15.mmCertificationIndicator, CorporateActionOption20.mmCertificationIndicator,
					CorporateActionOption32.mmCertificationIndicator, CorporateActionOption35.mmCertificationBreakdownIndicator, CorporateActionOption44.mmCertificationBreakdownIndicator,
					CorporateActionOption52.mmCertificationBreakdownIndicator, CorporateActionOption55.mmCertificationBreakdownIndicator, CorporateAction3.mmCertificationRequiredIndicator, CorporateActionOption3.mmCertificationIndicator,
					CorporateAction4.mmCertificationRequiredIndicator, CorporateActionOption17.mmCertificationIndicator, CorporateAction5.mmCertificationRequiredIndicator, CorporateActionOption19.mmCertificationIndicator,
					CorporateAction6.mmCertificationRequiredIndicator, CorporateActionOption34.mmCertificationIndicator, CorporateAction7.mmCertificationBreakdownIndicator, CorporateActionOption36.mmCertificationBreakdownIndicator,
					CorporateAction8.mmCertificationBreakdownIndicator, CorporateActionOption45.mmCertificationBreakdownIndicator, CorporateAction10.mmCertificationBreakdownIndicator,
					CorporateActionOption51.mmCertificationBreakdownIndicator, CorporateAction11.mmCertificationBreakdownIndicator, CorporateActionOption56.mmCertificationBreakdownIndicator,
					CorporateAction2.mmCertificationRequiredIndicator, CorporateActionOption1.mmCertificationIndicator, BeneficialOwner1.mmCertificationIndicator, CorporateActionAdditionalInformation1.mmCertificationIndicator,
					CorporateActionOption100.mmCertificationBreakdownIndicator, CorporateActionOption101.mmCertificationBreakdownIndicator, CorporateAction12.mmCertificationBreakdownIndicator,
					CorporateActionOption108.mmCertificationBreakdownIndicator, CorporateActionOption106.mmCertificationBreakdownIndicator, CorporateAction17.mmCertificationBreakdownIndicator, BeneficialOwner2.mmCertificationIndicator,
					CorporateActionOption115.mmCertificationBreakdownIndicator, CorporateActionOption114.mmCertificationBreakdownIndicator, CorporateAction31.mmCertificationBreakdownIndicator,
					CorporateActionOption125.mmCertificationBreakdownIndicator, CorporateActionOption127.mmCertificationBreakdownIndicator, CorporateAction40.mmCertificationBreakdownIndicator,
					CorporateActionOption130.mmCertificationBreakdownIndicator, CorporateActionOption129.mmCertificationBreakdownIndicator, CorporateActionOption135.mmCertificationBreakdownIndicator,
					CorporateActionOption133.mmCertificationBreakdownIndicator);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CertificationFormatTypeCode certificationFormat;
	/**
	 * Specifies the certification format required, that is, physical or
	 * electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode
	 * CertificationFormatTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice#mmCode
	 * CertificationTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice#mmProprietary
	 * CertificationTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat2Choice#mmCode
	 * CertificationTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat2Choice#mmProprietary
	 * CertificationTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1FormatChoice#mmCode
	 * CertificationType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1FormatChoice#mmProprietary
	 * CertificationType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#mmCode
	 * CertificationTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#mmProprietary
	 * CertificationTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat4Choice#mmCode
	 * CertificationTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat4Choice#mmProprietary
	 * CertificationTypeFormat4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, that is, physical or electronic format."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificationFormat = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CertificationTypeFormat1Choice.mmCode, CertificationTypeFormat1Choice.mmProprietary, CertificationTypeFormat2Choice.mmCode, CertificationTypeFormat2Choice.mmProprietary,
					CertificationType1FormatChoice.mmCode, CertificationType1FormatChoice.mmProprietary, CertificationTypeFormat3Choice.mmCode, CertificationTypeFormat3Choice.mmProprietary, CertificationTypeFormat4Choice.mmCode,
					CertificationTypeFormat4Choice.mmProprietary);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationFormat";
			definition = "Specifies the certification format required, that is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificationFormatTypeCode.mmObject();
		}
	};
	protected ERISAEligibilityCode eRISAEligibility;
	/**
	 * Eligibility to federal Employee Retirement Income Security Act.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmERISAEligibility
	 * BeneficiaryInformation2.mmERISAEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmERISAEligibility
	 * BeneficiaryInformation1.mmERISAEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility to federal Employee Retirement Income Security Act."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmERISAEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficiaryInformation2.mmERISAEligibility, BeneficiaryInformation1.mmERISAEligibility);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ERISAEligibilityCode.mmObject();
		}
	};
	protected PercentageRate eRISARate;
	/**
	 * Federal Employee Retirement Income Security Act (ERISA) rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmERISARate
	 * BeneficiaryInformation2.mmERISARate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmERISARate
	 * BeneficiaryInformation1.mmERISARate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Federal Employee Retirement Income Security Act (ERISA) rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmERISARate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficiaryInformation2.mmERISARate, BeneficiaryInformation1.mmERISARate);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected YesNoIndicator benefitPlanDeclarationIndicator;
	/**
	 * Indicates whether the investor is a benefit plan investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmBenefitPlanDeclarationIndicator
	 * BeneficiaryInformation2.mmBenefitPlanDeclarationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmBenefitPlanDeclarationIndicator
	 * BeneficiaryInformation1.mmBenefitPlanDeclarationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclarationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is a benefit plan investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBenefitPlanDeclarationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficiaryInformation2.mmBenefitPlanDeclarationIndicator, BeneficiaryInformation1.mmBenefitPlanDeclarationIndicator);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner";
				definition = "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCountryForBeneficialOwner);
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmBeneficiary, AccountParties5.mmBeneficiary, AccountParties6.mmBeneficiary, AccountParties3.mmBeneficiary, AccountParties4.mmBeneficiary,
						AccountParties7.mmBeneficiary, PartyIdentification33.mmOwnerIdentification, PartyIdentification34.mmOwnerIdentification, PartyIdentification50.mmOwnerIdentification, PartyIdentification51.mmOwnerIdentification,
						PartyIdentification56.mmOwnerIdentification, PartyIdentification57.mmOwnerIdentification, ConfirmationParties3.mmTradeBeneficiaryParty, ConfirmationParties4.mmTradeBeneficiaryParty,
						ConfirmationParties2.mmTradeBeneficiaryParty, CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails, AccountParties9.mmBeneficiary, AccountParties8.mmBeneficiary, AccountParties11.mmBeneficiary,
						AccountParties10.mmBeneficiary, AccountParties12.mmBeneficiary, SafekeepingAccount5.mmBeneficialOwner, AccountSubLevel1.mmBeneficialOwner, AccountSubLevel4.mmBeneficialOwner, AccountSubLevel5.mmBeneficialOwner,
						AccountSubLevel2.mmBeneficialOwner, AccountSubLevel3.mmBeneficialOwner, AccountSubLevel6.mmBeneficialOwner, AccountSubLevel7.mmBeneficialOwner, AccountSubLevel8.mmBeneficialOwner, AccountSubLevel9.mmBeneficialOwner,
						PartyIdentification93.mmOwnerIdentification, AccountParties13.mmBeneficiary, AccountParties14.mmBeneficiary, PartyIdentification101.mmOwnerIdentification, AccountParties15.mmBeneficiary,
						SafekeepingAccount7.mmBeneficialOwner, AccountParties16.mmBeneficiary, AccountSubLevel15.mmBeneficialOwner, AccountSubLevel16.mmBeneficialOwner, AccountSubLevel18.mmBeneficialOwner,
						AccountSubLevel19.mmBeneficialOwner, AccountSubLevel11.mmBeneficialOwner, AccountSubLevel12.mmBeneficialOwner, AccountSubLevel17.mmBeneficialOwner, AccountSubLevel13.mmBeneficialOwner,
						AccountSubLevel14.mmBeneficialOwner);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(BeneficialOwner.mmCertificationType, BeneficialOwner.mmNonDomicileCountry, BeneficialOwner.mmCertificationIndicator, BeneficialOwner.mmCertificationFormat,
						BeneficialOwner.mmERISAEligibility, BeneficialOwner.mmERISARate, BeneficialOwner.mmBenefitPlanDeclarationIndicator);
				derivationComponent_lazy = () -> Arrays.asList(BeneficiaryCertificationType2Choice.mmObject(), BeneficiaryCertificationType4Choice.mmObject(), BeneficiaryCertificationType6Choice.mmObject(),
						BeneficiaryCertificationType8Choice.mmObject(), BeneficiaryCertificationType1Choice.mmObject(), BeneficiaryCertificationType3Choice.mmObject(), BeneficiaryCertificationType5Choice.mmObject(),
						BeneficiaryCertificationType7Choice.mmObject(), BeneficiaryCertificationType1FormatChoice.mmObject(), BeneficialOwner1.mmObject(), BeneficiaryInformation2.mmObject(), BeneficiaryInformation1.mmObject(),
						BeneficialOwner2.mmObject(), BeneficiaryCertificationType9Choice.mmObject(), BeneficiaryCertificationType10Choice.mmObject(), BeneficiaryCertificationType11Choice.mmObject(),
						BeneficiaryCertificationType12Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BeneficiaryCertificationTypeCode getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(BeneficiaryCertificationTypeCode certificationType) {
		this.certificationType = certificationType;
	}

	public Country getNonDomicileCountry() {
		return nonDomicileCountry;
	}

	public void setNonDomicileCountry(com.tools20022.repository.entity.Country nonDomicileCountry) {
		this.nonDomicileCountry = nonDomicileCountry;
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
	}

	public CertificationFormatTypeCode getCertificationFormat() {
		return certificationFormat;
	}

	public void setCertificationFormat(CertificationFormatTypeCode certificationFormat) {
		this.certificationFormat = certificationFormat;
	}

	public ERISAEligibilityCode getERISAEligibility() {
		return eRISAEligibility;
	}

	public void setERISAEligibility(ERISAEligibilityCode eRISAEligibility) {
		this.eRISAEligibility = eRISAEligibility;
	}

	public PercentageRate getERISARate() {
		return eRISARate;
	}

	public void setERISARate(PercentageRate eRISARate) {
		this.eRISARate = eRISARate;
	}

	public YesNoIndicator getBenefitPlanDeclarationIndicator() {
		return benefitPlanDeclarationIndicator;
	}

	public void setBenefitPlanDeclarationIndicator(YesNoIndicator benefitPlanDeclarationIndicator) {
		this.benefitPlanDeclarationIndicator = benefitPlanDeclarationIndicator;
	}
}