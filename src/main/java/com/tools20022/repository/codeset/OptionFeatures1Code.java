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
import com.tools20022.repository.codeset.OptionFeatures1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the feature of an option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#Conditional
 * OptionFeatures1Code.Conditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#MaximumCash
 * OptionFeatures1Code.MaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#MaximumSecurities
 * OptionFeatures1Code.MaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#OddLotPreference
 * OptionFeatures1Code.OddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#Proration
 * OptionFeatures1Code.Proration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#OverAndAbove
 * OptionFeatures1Code.OverAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#QuantityToReceive
 * OptionFeatures1Code.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#ReducedWithholdingTax
 * OptionFeatures1Code.ReducedWithholdingTax}</li>
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
 * definition} = "Specifies the feature of an option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
 * OptionFeatures6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionFeatures1Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#Conditional
	 * OptionFeatures6Code.Conditional}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code Conditional = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.Conditional);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.Conditional.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#MaximumCash
	 * OptionFeatures6Code.MaximumCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code MaximumCash = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.MaximumCash);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.MaximumCash.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#MaximumSecurities
	 * OptionFeatures6Code.MaximumSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code MaximumSecurities = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.MaximumSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.MaximumSecurities.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#OddLotPreference
	 * OptionFeatures6Code.OddLotPreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code OddLotPreference = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.OddLotPreference);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.OddLotPreference.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#Proration
	 * OptionFeatures6Code.Proration}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code Proration = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.Proration);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.Proration.getCodeName().orElse(name);
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
	public static final OptionFeatures1Code OverAndAbove = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAbove";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.OverAndAbove.getCodeName().orElse(name);
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
	public static final OptionFeatures1Code QuantityToReceive = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToReceive";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.QuantityToReceive.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#ReducedWithholdingTax
	 * OptionFeatures6Code.ReducedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final OptionFeatures1Code ReducedWithholdingTax = new OptionFeatures1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.ReducedWithholdingTax);
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures1Code.mmObject();
			codeName = OptionFeaturesCode.ReducedWithholdingTax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionFeatures1Code> codesByName = new LinkedHashMap<>();

	protected OptionFeatures1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures1Code";
				definition = "Specifies the feature of an option.";
				nextVersions_lazy = () -> Arrays.asList(OptionFeatures6Code.mmObject());
				trace_lazy = () -> OptionFeaturesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeatures1Code.Conditional, com.tools20022.repository.codeset.OptionFeatures1Code.MaximumCash,
						com.tools20022.repository.codeset.OptionFeatures1Code.MaximumSecurities, com.tools20022.repository.codeset.OptionFeatures1Code.OddLotPreference, com.tools20022.repository.codeset.OptionFeatures1Code.Proration,
						com.tools20022.repository.codeset.OptionFeatures1Code.OverAndAbove, com.tools20022.repository.codeset.OptionFeatures1Code.QuantityToReceive,
						com.tools20022.repository.codeset.OptionFeatures1Code.ReducedWithholdingTax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Conditional.getCodeName().get(), Conditional);
		codesByName.put(MaximumCash.getCodeName().get(), MaximumCash);
		codesByName.put(MaximumSecurities.getCodeName().get(), MaximumSecurities);
		codesByName.put(OddLotPreference.getCodeName().get(), OddLotPreference);
		codesByName.put(Proration.getCodeName().get(), Proration);
		codesByName.put(OverAndAbove.getCodeName().get(), OverAndAbove);
		codesByName.put(QuantityToReceive.getCodeName().get(), QuantityToReceive);
		codesByName.put(ReducedWithholdingTax.getCodeName().get(), ReducedWithholdingTax);
	}

	public static OptionFeatures1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionFeatures1Code[] values() {
		OptionFeatures1Code[] values = new OptionFeatures1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionFeatures1Code> {
		@Override
		public OptionFeatures1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionFeatures1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}