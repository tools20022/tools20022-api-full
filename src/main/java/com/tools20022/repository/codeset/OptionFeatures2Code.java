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
import com.tools20022.repository.codeset.OptionFeatures2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#OptionApplicability
 * OptionFeatures2Code.OptionApplicability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#Conditional
 * OptionFeatures2Code.Conditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#MaximumCash
 * OptionFeatures2Code.MaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#MaximumSecurities
 * OptionFeatures2Code.MaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#OddLotPreference
 * OptionFeatures2Code.OddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#Proration
 * OptionFeatures2Code.Proration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#OverAndAbove
 * OptionFeatures2Code.OverAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#QuantityToReceive
 * OptionFeatures2Code.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#ReducedWithholdingTax
 * OptionFeatures2Code.ReducedWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code#NoServiceOffered
 * OptionFeatures2Code.NoServiceOffered}</li>
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
 * <li>"CAOS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionFeatures2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the features that may apply to a corporate action option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionFeatures2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionApplicability"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code OptionApplicability = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionApplicability";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.OptionApplicability.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditional"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code Conditional = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.Conditional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCash"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code MaximumCash = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.MaximumCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSecurities"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code MaximumSecurities = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.MaximumSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotPreference"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code OddLotPreference = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.OddLotPreference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proration"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code Proration = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.Proration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAbove"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code OverAndAbove = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAndAbove";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.OverAndAbove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code QuantityToReceive = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToReceive";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.QuantityToReceive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReducedWithholdingTax"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code ReducedWithholdingTax = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.ReducedWithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures2Code
	 * OptionFeatures2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoServiceOffered"</li>
	 * </ul>
	 */
	public static final OptionFeatures2Code NoServiceOffered = new OptionFeatures2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoServiceOffered";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures2Code.mmObject();
			codeName = OptionFeaturesCode.NoServiceOffered.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionFeatures2Code> codesByName = new LinkedHashMap<>();

	protected OptionFeatures2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAOS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures2Code";
				definition = "Specifies the features that may apply to a corporate action option.";
				trace_lazy = () -> OptionFeaturesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeatures2Code.OptionApplicability, com.tools20022.repository.codeset.OptionFeatures2Code.Conditional,
						com.tools20022.repository.codeset.OptionFeatures2Code.MaximumCash, com.tools20022.repository.codeset.OptionFeatures2Code.MaximumSecurities, com.tools20022.repository.codeset.OptionFeatures2Code.OddLotPreference,
						com.tools20022.repository.codeset.OptionFeatures2Code.Proration, com.tools20022.repository.codeset.OptionFeatures2Code.OverAndAbove, com.tools20022.repository.codeset.OptionFeatures2Code.QuantityToReceive,
						com.tools20022.repository.codeset.OptionFeatures2Code.ReducedWithholdingTax, com.tools20022.repository.codeset.OptionFeatures2Code.NoServiceOffered);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OptionApplicability.getCodeName().get(), OptionApplicability);
		codesByName.put(Conditional.getCodeName().get(), Conditional);
		codesByName.put(MaximumCash.getCodeName().get(), MaximumCash);
		codesByName.put(MaximumSecurities.getCodeName().get(), MaximumSecurities);
		codesByName.put(OddLotPreference.getCodeName().get(), OddLotPreference);
		codesByName.put(Proration.getCodeName().get(), Proration);
		codesByName.put(OverAndAbove.getCodeName().get(), OverAndAbove);
		codesByName.put(QuantityToReceive.getCodeName().get(), QuantityToReceive);
		codesByName.put(ReducedWithholdingTax.getCodeName().get(), ReducedWithholdingTax);
		codesByName.put(NoServiceOffered.getCodeName().get(), NoServiceOffered);
	}

	public static OptionFeatures2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionFeatures2Code[] values() {
		OptionFeatures2Code[] values = new OptionFeatures2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionFeatures2Code> {
		@Override
		public OptionFeatures2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionFeatures2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}