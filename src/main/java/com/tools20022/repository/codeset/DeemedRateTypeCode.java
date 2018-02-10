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
import com.tools20022.repository.codeset.DeemedRateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a deemed rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode#DeemedInterestProceeds
 * DeemedRateTypeCode.DeemedInterestProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode#DeemedDividendProceeds
 * DeemedRateTypeCode.DeemedDividendProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode#DeemedFundProceeds
 * DeemedRateTypeCode.DeemedFundProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode#DeemedRoyaltiesProceeds
 * DeemedRateTypeCode.DeemedRoyaltiesProceeds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DeemedRateType1Code
 * DeemedRateType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DEIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeemedRateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a deemed rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeemedRateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Deemed rate of interest proceeds attributed to the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode
	 * DeemedRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedInterestProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deemed rate of interest proceeds attributed to the security holder."</li>
	 * </ul>
	 */
	public static final DeemedRateTypeCode DeemedInterestProceeds = new DeemedRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedInterestProceeds";
			definition = "Deemed rate of interest proceeds attributed to the security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateTypeCode.mmObject();
			codeName = "DEIT";
		}
	};
	/**
	 * Deemed rate of dividend proceeds attributed to the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode
	 * DeemedRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividendProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deemed rate of dividend proceeds attributed to the security holder."</li>
	 * </ul>
	 */
	public static final DeemedRateTypeCode DeemedDividendProceeds = new DeemedRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividendProceeds";
			definition = "Deemed rate of dividend proceeds attributed to the security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateTypeCode.mmObject();
			codeName = "DEDI";
		}
	};
	/**
	 * Deemed rate of fund proceeds attributed to the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode
	 * DeemedRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedFundProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deemed rate of fund proceeds attributed to the security holder."</li>
	 * </ul>
	 */
	public static final DeemedRateTypeCode DeemedFundProceeds = new DeemedRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedFundProceeds";
			definition = "Deemed rate of fund proceeds attributed to the security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateTypeCode.mmObject();
			codeName = "DEFP";
		}
	};
	/**
	 * Deemed rate of royalties proceeds attributed to the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode
	 * DeemedRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DERY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRoyaltiesProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deemed rate of royalties proceeds attributed to the security holder."</li>
	 * </ul>
	 */
	public static final DeemedRateTypeCode DeemedRoyaltiesProceeds = new DeemedRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRoyaltiesProceeds";
			definition = "Deemed rate of royalties proceeds attributed to the security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateTypeCode.mmObject();
			codeName = "DERY";
		}
	};
	final static private LinkedHashMap<String, DeemedRateTypeCode> codesByName = new LinkedHashMap<>();

	protected DeemedRateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeemedRateTypeCode";
				definition = "Specifies the type of a deemed rate.";
				derivation_lazy = () -> Arrays.asList(DeemedRateType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeemedRateTypeCode.DeemedInterestProceeds, com.tools20022.repository.codeset.DeemedRateTypeCode.DeemedDividendProceeds,
						com.tools20022.repository.codeset.DeemedRateTypeCode.DeemedFundProceeds, com.tools20022.repository.codeset.DeemedRateTypeCode.DeemedRoyaltiesProceeds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DeemedInterestProceeds.getCodeName().get(), DeemedInterestProceeds);
		codesByName.put(DeemedDividendProceeds.getCodeName().get(), DeemedDividendProceeds);
		codesByName.put(DeemedFundProceeds.getCodeName().get(), DeemedFundProceeds);
		codesByName.put(DeemedRoyaltiesProceeds.getCodeName().get(), DeemedRoyaltiesProceeds);
	}

	public static DeemedRateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeemedRateTypeCode[] values() {
		DeemedRateTypeCode[] values = new DeemedRateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeemedRateTypeCode> {
		@Override
		public DeemedRateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeemedRateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}