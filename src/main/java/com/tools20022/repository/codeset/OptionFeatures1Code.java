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
 * Specifies the feature of an option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
 * OptionFeaturesCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmConditional
 * OptionFeatures1Code.mmConditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmMaximumCash
 * OptionFeatures1Code.mmMaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmMaximumSecurities
 * OptionFeatures1Code.mmMaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmOddLotPreference
 * OptionFeatures1Code.mmOddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmProration
 * OptionFeatures1Code.mmProration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmOverAndAbove
 * OptionFeatures1Code.mmOverAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmQuantityToReceive
 * OptionFeatures1Code.mmQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#mmReducedWithholdingTax
 * OptionFeatures1Code.mmReducedWithholdingTax}</li>
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
 * <li>"COND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionFeatures1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the  feature of an option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
 * OptionFeatures6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class OptionFeatures1Code extends OptionFeaturesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmConditional
	 * OptionFeatures6Code.mmConditional}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConditional = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmConditional);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmMaximumCash
	 * OptionFeatures6Code.mmMaximumCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaximumCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmMaximumCash);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmMaximumSecurities
	 * OptionFeatures6Code.mmMaximumSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaximumSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmMaximumSecurities);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmOddLotPreference
	 * OptionFeatures6Code.mmOddLotPreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOddLotPreference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmOddLotPreference);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmProration
	 * OptionFeatures6Code.mmProration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProration = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmProration);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
	 * OptionFeatures1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#mmReducedWithholdingTax
	 * OptionFeatures6Code.mmReducedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReducedWithholdingTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmReducedWithholdingTax);
			owner_lazy = () -> OptionFeatures1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures1Code";
				definition = "Specifies the  feature of an option.";
				nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmObject());
				code_lazy = () -> Arrays.asList(OptionFeatures1Code.mmConditional, OptionFeatures1Code.mmMaximumCash, OptionFeatures1Code.mmMaximumSecurities, OptionFeatures1Code.mmOddLotPreference, OptionFeatures1Code.mmProration,
						OptionFeatures1Code.mmOverAndAbove, OptionFeatures1Code.mmQuantityToReceive, OptionFeatures1Code.mmReducedWithholdingTax);
				trace_lazy = () -> OptionFeaturesCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}