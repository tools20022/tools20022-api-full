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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.codeset.ERISAEligibilityCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.msg.BeneficialOwner1;
import com.tools20022.repository.msg.BeneficialOwner2;
import com.tools20022.repository.msg.BeneficiaryInformation1;
import com.tools20022.repository.msg.BeneficiaryInformation2;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationType
 * BeneficialOwner.CertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
 * BeneficialOwner.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationIndicator
 * BeneficialOwner.CertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationFormat
 * BeneficialOwner.CertificationFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#ERISAEligibility
 * BeneficialOwner.ERISAEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BeneficialOwner#ERISARate
 * BeneficialOwner.ERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#BenefitPlanDeclarationIndicator
 * BeneficialOwner.BenefitPlanDeclarationIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
 * Country.CountryForBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#Beneficiary
 * AccountParties2.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Beneficiary
 * AccountParties5.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#Beneficiary
 * AccountParties6.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#Beneficiary
 * AccountParties3.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Beneficiary
 * AccountParties4.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#Beneficiary
 * AccountParties7.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#OwnerIdentification
 * PartyIdentification33.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#OwnerIdentification
 * PartyIdentification34.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#OwnerIdentification
 * PartyIdentification50.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#OwnerIdentification
 * PartyIdentification51.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#OwnerIdentification
 * PartyIdentification56.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#OwnerIdentification
 * PartyIdentification57.OwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties3#TradeBeneficiaryParty
 * ConfirmationParties3.TradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#TradeBeneficiaryParty
 * ConfirmationParties4.TradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#TradeBeneficiaryParty
 * ConfirmationParties2.TradeBeneficiaryParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#BeneficialOwnerDetails
 * CorporateActionAdditionalInformation1.BeneficialOwnerDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#Beneficiary
 * AccountParties9.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#Beneficiary
 * AccountParties8.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#Beneficiary
 * AccountParties11.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#Beneficiary
 * AccountParties10.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#Beneficiary
 * AccountParties12.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#BeneficialOwner
 * SafekeepingAccount5.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#BeneficialOwner
 * AccountSubLevel1.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#BeneficialOwner
 * AccountSubLevel4.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#BeneficialOwner
 * AccountSubLevel5.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#BeneficialOwner
 * AccountSubLevel2.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#BeneficialOwner
 * AccountSubLevel3.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#BeneficialOwner
 * AccountSubLevel6.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#BeneficialOwner
 * AccountSubLevel7.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#BeneficialOwner
 * AccountSubLevel8.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel9#BeneficialOwner
 * AccountSubLevel9.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#OwnerIdentification
 * PartyIdentification93.OwnerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#Beneficiary
 * AccountParties13.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#Beneficiary
 * AccountParties14.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#OwnerIdentification
 * PartyIdentification101.OwnerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#Beneficiary
 * AccountParties15.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#BeneficialOwner
 * SafekeepingAccount7.BeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#Beneficiary
 * AccountParties16.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#BeneficialOwner
 * AccountSubLevel15.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#BeneficialOwner
 * AccountSubLevel16.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#BeneficialOwner
 * AccountSubLevel18.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel19#BeneficialOwner
 * AccountSubLevel19.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#BeneficialOwner
 * AccountSubLevel11.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#BeneficialOwner
 * AccountSubLevel12.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#BeneficialOwner
 * AccountSubLevel17.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#BeneficialOwner
 * AccountSubLevel13.BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#BeneficialOwner
 * AccountSubLevel14.BeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice#Code
	 * BeneficiaryCertificationType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice#Proprietary
	 * BeneficiaryCertificationType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#CertificationType
	 * PartyIdentification33.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice#Code
	 * BeneficiaryCertificationType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType4Choice#Proprietary
	 * BeneficiaryCertificationType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#CertificationType
	 * PartyIdentification34.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#CertificationType
	 * PartyIdentification50.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#CertificationType
	 * PartyIdentification51.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType6Choice#Code
	 * BeneficiaryCertificationType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType6Choice#Proprietary
	 * BeneficiaryCertificationType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#CertificationType
	 * PartyIdentification56.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType8Choice#Code
	 * BeneficiaryCertificationType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType8Choice#Proprietary
	 * BeneficiaryCertificationType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#CertificationType
	 * PartyIdentification57.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice#Code
	 * BeneficiaryCertificationType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice#Proprietary
	 * BeneficiaryCertificationType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#CertificationType
	 * CorporateActionOption10.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice#Code
	 * BeneficiaryCertificationType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType3Choice#Proprietary
	 * BeneficiaryCertificationType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#CertificationType
	 * CorporateActionOption15.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#CertificationType
	 * CorporateActionOption20.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#CertificationType
	 * CorporateActionOption32.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType5Choice#Code
	 * BeneficiaryCertificationType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType5Choice#Proprietary
	 * BeneficiaryCertificationType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#CertificationBreakdownType
	 * CorporateActionOption35.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice#Code
	 * BeneficiaryCertificationType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType7Choice#Proprietary
	 * BeneficiaryCertificationType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#CertificationBreakdownType
	 * CorporateActionOption44.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#CertificationBreakdownType
	 * CorporateActionOption52.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#CertificationBreakdownType
	 * CorporateActionOption55.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#CertificationType
	 * CorporateAction3.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#CertificationType
	 * CorporateActionOption3.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#CertificationType
	 * CorporateAction4.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#CertificationType
	 * CorporateActionOption17.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#CertificationType
	 * CorporateAction5.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#CertificationType
	 * CorporateActionOption19.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#CertificationType
	 * CorporateAction6.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#CertificationType
	 * CorporateActionOption34.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#CertificationType
	 * CorporateAction7.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#CertificationBreakdownType
	 * CorporateActionOption36.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#CertificationType
	 * CorporateAction8.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#CertificationBreakdownType
	 * CorporateActionOption45.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#CertificationType
	 * CorporateAction10.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#CertificationBreakdownType
	 * CorporateActionOption51.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#CertificationType
	 * CorporateAction11.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#CertificationBreakdownType
	 * CorporateActionOption56.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#Code
	 * BeneficiaryCertificationType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#Proprietary
	 * BeneficiaryCertificationType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#CertificationType
	 * CorporateAction2.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#CertificationType
	 * CorporateActionOption1.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#CertificationType
	 * BeneficialOwner1.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#CertificationType
	 * CorporateActionAdditionalInformation1.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#CertificationBreakdownType
	 * CorporateActionOption100.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#CertificationBreakdownType
	 * CorporateActionOption101.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#CertificationType
	 * CorporateAction12.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#CertificationBreakdownType
	 * CorporateActionOption108.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#CertificationBreakdownType
	 * CorporateActionOption106.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#CertificationType
	 * CorporateAction17.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#CertificationType
	 * BeneficialOwner2.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#Code
	 * BeneficiaryCertificationType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice#Proprietary
	 * BeneficiaryCertificationType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#CertificationType
	 * PartyIdentification93.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#CertificationBreakdownType
	 * CorporateActionOption115.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#CertificationBreakdownType
	 * CorporateActionOption114.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#CertificationType
	 * CorporateAction31.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#Code
	 * BeneficiaryCertificationType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType10Choice#Proprietary
	 * BeneficiaryCertificationType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#CertificationBreakdownType
	 * CorporateActionOption125.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#CertificationType
	 * PartyIdentification101.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#CertificationBreakdownType
	 * CorporateActionOption127.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#CertificationType
	 * CorporateAction40.CertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType11Choice#Code
	 * BeneficiaryCertificationType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType11Choice#Proprietary
	 * BeneficiaryCertificationType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType12Choice#Code
	 * BeneficiaryCertificationType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType12Choice#Proprietary
	 * BeneficiaryCertificationType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#CertificationBreakdownType
	 * CorporateActionOption130.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#CertificationBreakdownType
	 * CorporateActionOption129.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#CertificationBreakdownType
	 * CorporateActionOption135.CertificationBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#CertificationBreakdownType
	 * CorporateActionOption133.CertificationBreakdownType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute CertificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BeneficiaryCertificationType2Choice.Code, com.tools20022.repository.choice.BeneficiaryCertificationType2Choice.Proprietary,
					com.tools20022.repository.msg.PartyIdentification33.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType4Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType4Choice.Proprietary, com.tools20022.repository.msg.PartyIdentification34.CertificationType,
					com.tools20022.repository.msg.PartyIdentification50.CertificationType, com.tools20022.repository.msg.PartyIdentification51.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType6Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType6Choice.Proprietary, com.tools20022.repository.msg.PartyIdentification56.CertificationType,
					com.tools20022.repository.choice.BeneficiaryCertificationType8Choice.Code, com.tools20022.repository.choice.BeneficiaryCertificationType8Choice.Proprietary,
					com.tools20022.repository.msg.PartyIdentification57.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType1Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType1Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption10.CertificationType,
					com.tools20022.repository.choice.BeneficiaryCertificationType3Choice.Code, com.tools20022.repository.choice.BeneficiaryCertificationType3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption15.CertificationType, com.tools20022.repository.msg.CorporateActionOption20.CertificationType, com.tools20022.repository.msg.CorporateActionOption32.CertificationType,
					com.tools20022.repository.choice.BeneficiaryCertificationType5Choice.Code, com.tools20022.repository.choice.BeneficiaryCertificationType5Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption35.CertificationBreakdownType, com.tools20022.repository.choice.BeneficiaryCertificationType7Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType7Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption44.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateActionOption52.CertificationBreakdownType, com.tools20022.repository.msg.CorporateActionOption55.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateAction3.CertificationType, com.tools20022.repository.msg.CorporateActionOption3.CertificationType, com.tools20022.repository.msg.CorporateAction4.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption17.CertificationType, com.tools20022.repository.msg.CorporateAction5.CertificationType, com.tools20022.repository.msg.CorporateActionOption19.CertificationType,
					com.tools20022.repository.msg.CorporateAction6.CertificationType, com.tools20022.repository.msg.CorporateActionOption34.CertificationType, com.tools20022.repository.msg.CorporateAction7.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption36.CertificationBreakdownType, com.tools20022.repository.msg.CorporateAction8.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption45.CertificationBreakdownType, com.tools20022.repository.msg.CorporateAction10.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption51.CertificationBreakdownType, com.tools20022.repository.msg.CorporateAction11.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption56.CertificationBreakdownType, com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateAction2.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption1.CertificationType, com.tools20022.repository.msg.BeneficialOwner1.CertificationType,
					com.tools20022.repository.msg.CorporateActionAdditionalInformation1.CertificationType, com.tools20022.repository.msg.CorporateActionOption100.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateActionOption101.CertificationBreakdownType, com.tools20022.repository.msg.CorporateAction12.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption108.CertificationBreakdownType, com.tools20022.repository.msg.CorporateActionOption106.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateAction17.CertificationType, com.tools20022.repository.msg.BeneficialOwner2.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType9Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType9Choice.Proprietary, com.tools20022.repository.msg.PartyIdentification93.CertificationType,
					com.tools20022.repository.msg.CorporateActionOption115.CertificationBreakdownType, com.tools20022.repository.msg.CorporateActionOption114.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateAction31.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType10Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType10Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption125.CertificationBreakdownType,
					com.tools20022.repository.msg.PartyIdentification101.CertificationType, com.tools20022.repository.msg.CorporateActionOption127.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateAction40.CertificationType, com.tools20022.repository.choice.BeneficiaryCertificationType11Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType11Choice.Proprietary, com.tools20022.repository.choice.BeneficiaryCertificationType12Choice.Code,
					com.tools20022.repository.choice.BeneficiaryCertificationType12Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption130.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateActionOption129.CertificationBreakdownType, com.tools20022.repository.msg.CorporateActionOption135.CertificationBreakdownType,
					com.tools20022.repository.msg.CorporateActionOption133.CertificationBreakdownType);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
		}
	};
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
	 * Country.CountryForBeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#NonDomicileCountry
	 * CorporateActionOption10.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#NonDomicileCountry
	 * CorporateActionOption15.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#NonDomicileCountry
	 * CorporateActionOption20.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#NonDomicileCountry
	 * CorporateActionOption32.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#NonDomicileCountry
	 * CorporateActionOption35.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#NonDomicileCountry
	 * CorporateActionOption44.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#NonDomicileCountry
	 * CorporateActionOption52.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#NonDomicileCountry
	 * CorporateActionOption55.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#NonDomicileCountry
	 * CorporateActionOption3.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#NonDomicileCountry
	 * CorporateActionOption17.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#NonDomicileCountry
	 * CorporateActionOption19.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#NonDomicileCountry
	 * CorporateActionOption34.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#NonDomicileCountry
	 * CorporateActionOption36.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#NonDomicileCountry
	 * CorporateActionOption45.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#NonDomicileCountry
	 * CorporateActionOption51.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#NonDomicileCountry
	 * CorporateActionOption56.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#NonDomicileCountry
	 * BeneficialOwner1.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#NonDomicileCountry
	 * CorporateActionOption100.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#NonDomicileCountry
	 * CorporateActionOption101.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#NonDomicileCountry
	 * CorporateActionOption108.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#NonDomicileCountry
	 * CorporateActionOption106.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#NonDomicileCountry
	 * BeneficialOwner2.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#NonDomicileCountry
	 * CorporateActionOption115.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#NonDomicileCountry
	 * CorporateActionOption114.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#NonDomicileCountry
	 * CorporateActionOption125.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#NonDomicileCountry
	 * CorporateActionOption127.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#NonDomicileCountry
	 * CorporateActionOption130.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#NonDomicileCountry
	 * CorporateActionOption129.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#NonDomicileCountry
	 * CorporateActionOption135.NonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#NonDomicileCountry
	 * CorporateActionOption133.NonDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAssociationEnd NonDomicileCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption15.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption20.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption32.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption35.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption44.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption52.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption55.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption3.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption17.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption19.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption34.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption36.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption45.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption51.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption56.NonDomicileCountry, com.tools20022.repository.msg.BeneficialOwner1.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption100.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption101.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption108.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption106.NonDomicileCountry, com.tools20022.repository.msg.BeneficialOwner2.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption115.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption114.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption125.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption127.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption130.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption129.NonDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption135.NonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption133.NonDomicileCountry);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryForBeneficialOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#CertificationIndicator
	 * CorporateActionOption10.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#CertificationIndicator
	 * CorporateActionOption15.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#CertificationIndicator
	 * CorporateActionOption20.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#CertificationIndicator
	 * CorporateActionOption32.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#CertificationBreakdownIndicator
	 * CorporateActionOption35.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#CertificationBreakdownIndicator
	 * CorporateActionOption44.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#CertificationBreakdownIndicator
	 * CorporateActionOption52.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#CertificationBreakdownIndicator
	 * CorporateActionOption55.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#CertificationRequiredIndicator
	 * CorporateAction3.CertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#CertificationIndicator
	 * CorporateActionOption3.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#CertificationRequiredIndicator
	 * CorporateAction4.CertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#CertificationIndicator
	 * CorporateActionOption17.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#CertificationRequiredIndicator
	 * CorporateAction5.CertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#CertificationIndicator
	 * CorporateActionOption19.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#CertificationRequiredIndicator
	 * CorporateAction6.CertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#CertificationIndicator
	 * CorporateActionOption34.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#CertificationBreakdownIndicator
	 * CorporateAction7.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#CertificationBreakdownIndicator
	 * CorporateActionOption36.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#CertificationBreakdownIndicator
	 * CorporateAction8.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#CertificationBreakdownIndicator
	 * CorporateActionOption45.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#CertificationBreakdownIndicator
	 * CorporateAction10.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#CertificationBreakdownIndicator
	 * CorporateActionOption51.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#CertificationBreakdownIndicator
	 * CorporateAction11.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#CertificationBreakdownIndicator
	 * CorporateActionOption56.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#CertificationRequiredIndicator
	 * CorporateAction2.CertificationRequiredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#CertificationIndicator
	 * CorporateActionOption1.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#CertificationIndicator
	 * BeneficialOwner1.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#CertificationIndicator
	 * CorporateActionAdditionalInformation1.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#CertificationBreakdownIndicator
	 * CorporateActionOption100.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#CertificationBreakdownIndicator
	 * CorporateActionOption101.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#CertificationBreakdownIndicator
	 * CorporateAction12.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#CertificationBreakdownIndicator
	 * CorporateActionOption108.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#CertificationBreakdownIndicator
	 * CorporateActionOption106.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#CertificationBreakdownIndicator
	 * CorporateAction17.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#CertificationIndicator
	 * BeneficialOwner2.CertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#CertificationBreakdownIndicator
	 * CorporateActionOption115.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#CertificationBreakdownIndicator
	 * CorporateActionOption114.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#CertificationBreakdownIndicator
	 * CorporateAction31.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#CertificationBreakdownIndicator
	 * CorporateActionOption125.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#CertificationBreakdownIndicator
	 * CorporateActionOption127.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#CertificationBreakdownIndicator
	 * CorporateAction40.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#CertificationBreakdownIndicator
	 * CorporateActionOption130.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#CertificationBreakdownIndicator
	 * CorporateActionOption129.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#CertificationBreakdownIndicator
	 * CorporateActionOption135.CertificationBreakdownIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#CertificationBreakdownIndicator
	 * CorporateActionOption133.CertificationBreakdownIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute CertificationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.CertificationIndicator, com.tools20022.repository.msg.CorporateActionOption15.CertificationIndicator,
					com.tools20022.repository.msg.CorporateActionOption20.CertificationIndicator, com.tools20022.repository.msg.CorporateActionOption32.CertificationIndicator,
					com.tools20022.repository.msg.CorporateActionOption35.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption44.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption52.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption55.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction3.CertificationRequiredIndicator, com.tools20022.repository.msg.CorporateActionOption3.CertificationIndicator,
					com.tools20022.repository.msg.CorporateAction4.CertificationRequiredIndicator, com.tools20022.repository.msg.CorporateActionOption17.CertificationIndicator,
					com.tools20022.repository.msg.CorporateAction5.CertificationRequiredIndicator, com.tools20022.repository.msg.CorporateActionOption19.CertificationIndicator,
					com.tools20022.repository.msg.CorporateAction6.CertificationRequiredIndicator, com.tools20022.repository.msg.CorporateActionOption34.CertificationIndicator,
					com.tools20022.repository.msg.CorporateAction7.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption36.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction8.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption45.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction10.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption51.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction11.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption56.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction2.CertificationRequiredIndicator, com.tools20022.repository.msg.CorporateActionOption1.CertificationIndicator,
					com.tools20022.repository.msg.BeneficialOwner1.CertificationIndicator, com.tools20022.repository.msg.CorporateActionAdditionalInformation1.CertificationIndicator,
					com.tools20022.repository.msg.CorporateActionOption100.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption101.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction12.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption108.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption106.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateAction17.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.BeneficialOwner2.CertificationIndicator, com.tools20022.repository.msg.CorporateActionOption115.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption114.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateAction31.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption125.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption127.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateAction40.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption130.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption129.CertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateActionOption135.CertificationBreakdownIndicator,
					com.tools20022.repository.msg.CorporateActionOption133.CertificationBreakdownIndicator);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice#Code
	 * CertificationTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice#Proprietary
	 * CertificationTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat2Choice#Code
	 * CertificationTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat2Choice#Proprietary
	 * CertificationTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1FormatChoice#Code
	 * CertificationType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1FormatChoice#Proprietary
	 * CertificationType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#Code
	 * CertificationTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice#Proprietary
	 * CertificationTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat4Choice#Code
	 * CertificationTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat4Choice#Proprietary
	 * CertificationTypeFormat4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute CertificationFormat = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CertificationTypeFormat1Choice.Code, com.tools20022.repository.choice.CertificationTypeFormat1Choice.Proprietary,
					com.tools20022.repository.choice.CertificationTypeFormat2Choice.Code, com.tools20022.repository.choice.CertificationTypeFormat2Choice.Proprietary, com.tools20022.repository.choice.CertificationType1FormatChoice.Code,
					com.tools20022.repository.choice.CertificationType1FormatChoice.Proprietary, com.tools20022.repository.choice.CertificationTypeFormat3Choice.Code,
					com.tools20022.repository.choice.CertificationTypeFormat3Choice.Proprietary, com.tools20022.repository.choice.CertificationTypeFormat4Choice.Code,
					com.tools20022.repository.choice.CertificationTypeFormat4Choice.Proprietary);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationFormat";
			definition = "Specifies the certification format required, that is, physical or electronic format.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CertificationFormatTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#ERISAEligibility
	 * BeneficiaryInformation2.ERISAEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#ERISAEligibility
	 * BeneficiaryInformation1.ERISAEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute ERISAEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficiaryInformation2.ERISAEligibility, com.tools20022.repository.msg.BeneficiaryInformation1.ERISAEligibility);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ERISAEligibilityCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#ERISARate
	 * BeneficiaryInformation2.ERISARate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#ERISARate
	 * BeneficiaryInformation1.ERISARate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute ERISARate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficiaryInformation2.ERISARate, com.tools20022.repository.msg.BeneficiaryInformation1.ERISARate);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#BenefitPlanDeclarationIndicator
	 * BeneficiaryInformation2.BenefitPlanDeclarationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#BenefitPlanDeclarationIndicator
	 * BeneficiaryInformation1.BenefitPlanDeclarationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
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
	public static final MMBusinessAttribute BenefitPlanDeclarationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficiaryInformation2.BenefitPlanDeclarationIndicator, com.tools20022.repository.msg.BeneficiaryInformation1.BenefitPlanDeclarationIndicator);
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner";
				definition = "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.CountryForBeneficialOwner);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.Beneficiary, com.tools20022.repository.msg.AccountParties5.Beneficiary, com.tools20022.repository.msg.AccountParties6.Beneficiary,
						com.tools20022.repository.msg.AccountParties3.Beneficiary, com.tools20022.repository.msg.AccountParties4.Beneficiary, com.tools20022.repository.msg.AccountParties7.Beneficiary,
						com.tools20022.repository.msg.PartyIdentification33.OwnerIdentification, com.tools20022.repository.msg.PartyIdentification34.OwnerIdentification,
						com.tools20022.repository.msg.PartyIdentification50.OwnerIdentification, com.tools20022.repository.msg.PartyIdentification51.OwnerIdentification,
						com.tools20022.repository.msg.PartyIdentification56.OwnerIdentification, com.tools20022.repository.msg.PartyIdentification57.OwnerIdentification,
						com.tools20022.repository.msg.ConfirmationParties3.TradeBeneficiaryParty, com.tools20022.repository.msg.ConfirmationParties4.TradeBeneficiaryParty,
						com.tools20022.repository.msg.ConfirmationParties2.TradeBeneficiaryParty, com.tools20022.repository.msg.CorporateActionAdditionalInformation1.BeneficialOwnerDetails,
						com.tools20022.repository.msg.AccountParties9.Beneficiary, com.tools20022.repository.msg.AccountParties8.Beneficiary, com.tools20022.repository.msg.AccountParties11.Beneficiary,
						com.tools20022.repository.msg.AccountParties10.Beneficiary, com.tools20022.repository.msg.AccountParties12.Beneficiary, com.tools20022.repository.msg.SafekeepingAccount5.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel1.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel4.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel5.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel2.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel3.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel6.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel7.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel8.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel9.BeneficialOwner,
						com.tools20022.repository.msg.PartyIdentification93.OwnerIdentification, com.tools20022.repository.msg.AccountParties13.Beneficiary, com.tools20022.repository.msg.AccountParties14.Beneficiary,
						com.tools20022.repository.msg.PartyIdentification101.OwnerIdentification, com.tools20022.repository.msg.AccountParties15.Beneficiary, com.tools20022.repository.msg.SafekeepingAccount7.BeneficialOwner,
						com.tools20022.repository.msg.AccountParties16.Beneficiary, com.tools20022.repository.msg.AccountSubLevel15.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel16.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel18.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel19.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel11.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel12.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel17.BeneficialOwner, com.tools20022.repository.msg.AccountSubLevel13.BeneficialOwner,
						com.tools20022.repository.msg.AccountSubLevel14.BeneficialOwner);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BeneficialOwner.CertificationType, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.BeneficialOwner.CertificationIndicator, com.tools20022.repository.entity.BeneficialOwner.CertificationFormat, com.tools20022.repository.entity.BeneficialOwner.ERISAEligibility,
						com.tools20022.repository.entity.BeneficialOwner.ERISARate, com.tools20022.repository.entity.BeneficialOwner.BenefitPlanDeclarationIndicator);
				derivationComponent_lazy = () -> Arrays.asList(BeneficiaryCertificationType2Choice.mmObject(), BeneficiaryCertificationType4Choice.mmObject(), BeneficiaryCertificationType6Choice.mmObject(),
						BeneficiaryCertificationType8Choice.mmObject(), BeneficiaryCertificationType1Choice.mmObject(), BeneficiaryCertificationType3Choice.mmObject(), BeneficiaryCertificationType5Choice.mmObject(),
						BeneficiaryCertificationType7Choice.mmObject(), BeneficiaryCertificationType1FormatChoice.mmObject(), BeneficialOwner1.mmObject(), BeneficiaryInformation2.mmObject(), BeneficiaryInformation1.mmObject(),
						BeneficialOwner2.mmObject(), BeneficiaryCertificationType9Choice.mmObject(), BeneficiaryCertificationType10Choice.mmObject(), BeneficiaryCertificationType11Choice.mmObject(),
						BeneficiaryCertificationType12Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}