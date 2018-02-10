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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OptionFeatures8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the features that may apply to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#AccountServicerOption
 * OptionFeatures8Code.AccountServicerOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#BeneficiaryOwnerInstruction
 * OptionFeatures8Code.BeneficiaryOwnerInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#Conditional
 * OptionFeatures8Code.Conditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#MaximumCash
 * OptionFeatures8Code.MaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#MaximumSecurities
 * OptionFeatures8Code.MaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#NoServiceOffered
 * OptionFeatures8Code.NoServiceOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#OddLotPreference
 * OptionFeatures8Code.OddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#OptionApplicability
 * OptionFeatures8Code.OptionApplicability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#PreviousInstructionInvalidity
 * OptionFeatures8Code.PreviousInstructionInvalidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#Proration
 * OptionFeatures8Code.Proration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code#ReducedWithholdingTax
 * OptionFeatures8Code.ReducedWithholdingTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
 * OptionFeaturesCode}</li>
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
 * "OptionFeatures8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the features that may apply to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionFeatures10Code
 * OptionFeatures10Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code
 * OptionFeatures5Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionFeatures8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerOption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#AccountServicerOption
	 * OptionFeatures10Code.AccountServicerOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#AccountServicerOption
	 * OptionFeatures5Code.AccountServicerOption}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code AccountServicerOption = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerOption";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.AccountServicerOption);
			previousVersion_lazy = () -> OptionFeatures5Code.AccountServicerOption;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.AccountServicerOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryOwnerInstruction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#BeneficiaryOwnerInstruction
	 * OptionFeatures10Code.BeneficiaryOwnerInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#BeneficiaryOwnerInstruction
	 * OptionFeatures5Code.BeneficiaryOwnerInstruction}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code BeneficiaryOwnerInstruction = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryOwnerInstruction";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.BeneficiaryOwnerInstruction);
			previousVersion_lazy = () -> OptionFeatures5Code.BeneficiaryOwnerInstruction;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.BeneficiaryOwnerInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditional"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#Conditional
	 * OptionFeatures10Code.Conditional}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#Conditional
	 * OptionFeatures5Code.Conditional}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code Conditional = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.Conditional);
			previousVersion_lazy = () -> OptionFeatures5Code.Conditional;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.Conditional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCash"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#MaximumCash
	 * OptionFeatures10Code.MaximumCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#MaximumCash
	 * OptionFeatures5Code.MaximumCash}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code MaximumCash = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.MaximumCash);
			previousVersion_lazy = () -> OptionFeatures5Code.MaximumCash;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.MaximumCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSecurities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#MaximumSecurities
	 * OptionFeatures10Code.MaximumSecurities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#MaximumSecurities
	 * OptionFeatures5Code.MaximumSecurities}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code MaximumSecurities = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.MaximumSecurities);
			previousVersion_lazy = () -> OptionFeatures5Code.MaximumSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.MaximumSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoServiceOffered"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#NoServiceOffered
	 * OptionFeatures10Code.NoServiceOffered}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#NoServiceOffered
	 * OptionFeatures5Code.NoServiceOffered}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code NoServiceOffered = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoServiceOffered";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.NoServiceOffered);
			previousVersion_lazy = () -> OptionFeatures5Code.NoServiceOffered;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.NoServiceOffered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotPreference"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#OddLotPreference
	 * OptionFeatures10Code.OddLotPreference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#OddLotPreference
	 * OptionFeatures5Code.OddLotPreference}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code OddLotPreference = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.OddLotPreference);
			previousVersion_lazy = () -> OptionFeatures5Code.OddLotPreference;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.OddLotPreference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionApplicability"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#OptionApplicability
	 * OptionFeatures10Code.OptionApplicability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#OptionApplicability
	 * OptionFeatures5Code.OptionApplicability}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code OptionApplicability = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionApplicability";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.OptionApplicability);
			previousVersion_lazy = () -> OptionFeatures5Code.OptionApplicability;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.OptionApplicability.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructionInvalidity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#PreviousInstructionInvalidity
	 * OptionFeatures10Code.PreviousInstructionInvalidity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#PreviousInstructionInvalidity
	 * OptionFeatures5Code.PreviousInstructionInvalidity}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code PreviousInstructionInvalidity = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructionInvalidity";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.PreviousInstructionInvalidity);
			previousVersion_lazy = () -> OptionFeatures5Code.PreviousInstructionInvalidity;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.PreviousInstructionInvalidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proration"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#Proration
	 * OptionFeatures10Code.Proration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#Proration
	 * OptionFeatures5Code.Proration}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code Proration = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.Proration);
			previousVersion_lazy = () -> OptionFeatures5Code.Proration;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.Proration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures8Code
	 * OptionFeatures8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReducedWithholdingTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures10Code#ReducedWithholdingTax
	 * OptionFeatures10Code.ReducedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures5Code#ReducedWithholdingTax
	 * OptionFeatures5Code.ReducedWithholdingTax}</li>
	 * </ul>
	 */
	public static final OptionFeatures8Code ReducedWithholdingTax = new OptionFeatures8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.ReducedWithholdingTax);
			previousVersion_lazy = () -> OptionFeatures5Code.ReducedWithholdingTax;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures8Code.mmObject();
			codeName = OptionFeaturesCode.ReducedWithholdingTax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionFeatures8Code> codesByName = new LinkedHashMap<>();

	protected OptionFeatures8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures8Code";
				definition = "Specifies the features that may apply to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(OptionFeatures10Code.mmObject());
				previousVersion_lazy = () -> OptionFeatures5Code.mmObject();
				trace_lazy = () -> OptionFeaturesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeatures8Code.AccountServicerOption, com.tools20022.repository.codeset.OptionFeatures8Code.BeneficiaryOwnerInstruction,
						com.tools20022.repository.codeset.OptionFeatures8Code.Conditional, com.tools20022.repository.codeset.OptionFeatures8Code.MaximumCash, com.tools20022.repository.codeset.OptionFeatures8Code.MaximumSecurities,
						com.tools20022.repository.codeset.OptionFeatures8Code.NoServiceOffered, com.tools20022.repository.codeset.OptionFeatures8Code.OddLotPreference,
						com.tools20022.repository.codeset.OptionFeatures8Code.OptionApplicability, com.tools20022.repository.codeset.OptionFeatures8Code.PreviousInstructionInvalidity,
						com.tools20022.repository.codeset.OptionFeatures8Code.Proration, com.tools20022.repository.codeset.OptionFeatures8Code.ReducedWithholdingTax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerOption.getCodeName().get(), AccountServicerOption);
		codesByName.put(BeneficiaryOwnerInstruction.getCodeName().get(), BeneficiaryOwnerInstruction);
		codesByName.put(Conditional.getCodeName().get(), Conditional);
		codesByName.put(MaximumCash.getCodeName().get(), MaximumCash);
		codesByName.put(MaximumSecurities.getCodeName().get(), MaximumSecurities);
		codesByName.put(NoServiceOffered.getCodeName().get(), NoServiceOffered);
		codesByName.put(OddLotPreference.getCodeName().get(), OddLotPreference);
		codesByName.put(OptionApplicability.getCodeName().get(), OptionApplicability);
		codesByName.put(PreviousInstructionInvalidity.getCodeName().get(), PreviousInstructionInvalidity);
		codesByName.put(Proration.getCodeName().get(), Proration);
		codesByName.put(ReducedWithholdingTax.getCodeName().get(), ReducedWithholdingTax);
	}

	public static OptionFeatures8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionFeatures8Code[] values() {
		OptionFeatures8Code[] values = new OptionFeatures8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionFeatures8Code> {
		@Override
		public OptionFeatures8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionFeatures8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}