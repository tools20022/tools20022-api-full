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
import com.tools20022.repository.codeset.OptionFeatures6Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#Conditional
 * OptionFeatures6Code.Conditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#MaximumCash
 * OptionFeatures6Code.MaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#MaximumSecurities
 * OptionFeatures6Code.MaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#OddLotPreference
 * OptionFeatures6Code.OddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#Proration
 * OptionFeatures6Code.Proration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code#ReducedWithholdingTax
 * OptionFeatures6Code.ReducedWithholdingTax}</li>
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
 * "OptionFeatures6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the feature of an option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code
 * OptionFeatures1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionFeatures6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#Conditional
	 * OptionFeatures1Code.Conditional}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code Conditional = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conditional";
			previousVersion_lazy = () -> OptionFeatures1Code.Conditional;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.Conditional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#MaximumCash
	 * OptionFeatures1Code.MaximumCash}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code MaximumCash = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCash";
			previousVersion_lazy = () -> OptionFeatures1Code.MaximumCash;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.MaximumCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#MaximumSecurities
	 * OptionFeatures1Code.MaximumSecurities}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code MaximumSecurities = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSecurities";
			previousVersion_lazy = () -> OptionFeatures1Code.MaximumSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.MaximumSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotPreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#OddLotPreference
	 * OptionFeatures1Code.OddLotPreference}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code OddLotPreference = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotPreference";
			previousVersion_lazy = () -> OptionFeatures1Code.OddLotPreference;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.OddLotPreference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#Proration
	 * OptionFeatures1Code.Proration}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code Proration = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			previousVersion_lazy = () -> OptionFeatures1Code.Proration;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.Proration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures6Code
	 * OptionFeatures6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReducedWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeatures1Code#ReducedWithholdingTax
	 * OptionFeatures1Code.ReducedWithholdingTax}</li>
	 * </ul>
	 */
	public static final OptionFeatures6Code ReducedWithholdingTax = new OptionFeatures6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReducedWithholdingTax";
			previousVersion_lazy = () -> OptionFeatures1Code.ReducedWithholdingTax;
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeatures6Code.mmObject();
			codeName = OptionFeaturesCode.ReducedWithholdingTax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionFeatures6Code> codesByName = new LinkedHashMap<>();

	protected OptionFeatures6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeatures6Code";
				definition = "Specifies the feature of an option.";
				previousVersion_lazy = () -> OptionFeatures1Code.mmObject();
				trace_lazy = () -> OptionFeaturesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeatures6Code.Conditional, com.tools20022.repository.codeset.OptionFeatures6Code.MaximumCash,
						com.tools20022.repository.codeset.OptionFeatures6Code.MaximumSecurities, com.tools20022.repository.codeset.OptionFeatures6Code.OddLotPreference, com.tools20022.repository.codeset.OptionFeatures6Code.Proration,
						com.tools20022.repository.codeset.OptionFeatures6Code.ReducedWithholdingTax);
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
		codesByName.put(ReducedWithholdingTax.getCodeName().get(), ReducedWithholdingTax);
	}

	public static OptionFeatures6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionFeatures6Code[] values() {
		OptionFeatures6Code[] values = new OptionFeatures6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionFeatures6Code> {
		@Override
		public OptionFeatures6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionFeatures6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}