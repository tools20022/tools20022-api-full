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
import com.tools20022.repository.codeset.OptionFeaturesCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the features that may apply to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
 * OptionFeaturesCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmOptionApplicability
 * OptionFeatures4Code.mmOptionApplicability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmConditional
 * OptionFeatures4Code.mmConditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmMaximumCash
 * OptionFeatures4Code.mmMaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmMaximumSecurities
 * OptionFeatures4Code.mmMaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmOddLotPreference
 * OptionFeatures4Code.mmOddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmProration
 * OptionFeatures4Code.mmProration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmOverAndAbove
 * OptionFeatures4Code.mmOverAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmQuantityToReceive
 * OptionFeatures4Code.mmQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmReducedWithholdingTax
 * OptionFeatures4Code.mmReducedWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmNoServiceOffered
 * OptionFeatures4Code.mmNoServiceOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmPreviousInstructionInvalidity
 * OptionFeatures4Code.mmPreviousInstructionInvalidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code#mmAccountServicerOption
 * OptionFeatures4Code.mmAccountServicerOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAOS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionFeatures4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the features that may apply to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionFeatures7Code
 * OptionFeatures7Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures3Code
 * OptionFeatures3Code}</li>
 * </ul>
 */
public class OptionFeatures4Code extends OptionFeaturesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmOptionApplicability
	 * OptionFeatures7Code.mmOptionApplicability}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOptionApplicability = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionApplicability";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmOptionApplicability);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmConditional
	 * OptionFeatures7Code.mmConditional}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditional = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmConditional);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmMaximumCash
	 * OptionFeatures7Code.mmMaximumCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaximumCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmMaximumCash);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmMaximumSecurities
	 * OptionFeatures7Code.mmMaximumSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaximumSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmMaximumSecurities);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmOddLotPreference
	 * OptionFeatures7Code.mmOddLotPreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOddLotPreference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmOddLotPreference);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmProration
	 * OptionFeatures7Code.mmProration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmProration);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAbove"</li>
	 * </ul>
	 */
	public static final MMCode mmOverAndAbove = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAbove";
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * </ul>
	 */
	public static final MMCode mmQuantityToReceive = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToReceive";
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmReducedWithholdingTax
	 * OptionFeatures7Code.mmReducedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReducedWithholdingTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmReducedWithholdingTax);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmNoServiceOffered
	 * OptionFeatures7Code.mmNoServiceOffered}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoServiceOffered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoServiceOffered";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmNoServiceOffered);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmPreviousInstructionInvalidity
	 * OptionFeatures7Code.mmPreviousInstructionInvalidity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreviousInstructionInvalidity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructionInvalidity";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmPreviousInstructionInvalidity);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures4Code
	 * OptionFeatures4Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures7Code#mmAccountServicerOption
	 * OptionFeatures7Code.mmAccountServicerOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccountServicerOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerOption";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmAccountServicerOption);
			owner_lazy = () -> OptionFeatures4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAOS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures4Code";
				definition = "Specifies the features that may apply to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(OptionFeatures7Code.mmObject());
				previousVersion_lazy = () -> OptionFeatures3Code.mmObject();
				code_lazy = () -> Arrays.asList(OptionFeatures4Code.mmOptionApplicability, OptionFeatures4Code.mmConditional, OptionFeatures4Code.mmMaximumCash, OptionFeatures4Code.mmMaximumSecurities,
						OptionFeatures4Code.mmOddLotPreference, OptionFeatures4Code.mmProration, OptionFeatures4Code.mmOverAndAbove, OptionFeatures4Code.mmQuantityToReceive, OptionFeatures4Code.mmReducedWithholdingTax,
						OptionFeatures4Code.mmNoServiceOffered, OptionFeatures4Code.mmPreviousInstructionInvalidity, OptionFeatures4Code.mmAccountServicerOption);
				trace_lazy = () -> OptionFeaturesCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}