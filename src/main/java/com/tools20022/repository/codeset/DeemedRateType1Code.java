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
import com.tools20022.repository.codeset.DeemedRateType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code#DeemedDividendProceeds
 * DeemedRateType1Code.DeemedDividendProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code#DeemedFundProceeds
 * DeemedRateType1Code.DeemedFundProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code#DeemedInterestProceeds
 * DeemedRateType1Code.DeemedInterestProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code#DeemedRoyaltiesProceeds
 * DeemedRateType1Code.DeemedRoyaltiesProceeds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeemedRateTypeCode
 * DeemedRateTypeCode}</li>
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
 * "DeemedRateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a deemed rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeemedRateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code
	 * DeemedRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividendProceeds"</li>
	 * </ul>
	 */
	public static final DeemedRateType1Code DeemedDividendProceeds = new DeemedRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividendProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateType1Code.mmObject();
			codeName = DeemedRateTypeCode.DeemedDividendProceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code
	 * DeemedRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedFundProceeds"</li>
	 * </ul>
	 */
	public static final DeemedRateType1Code DeemedFundProceeds = new DeemedRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedFundProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateType1Code.mmObject();
			codeName = DeemedRateTypeCode.DeemedFundProceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code
	 * DeemedRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedInterestProceeds"</li>
	 * </ul>
	 */
	public static final DeemedRateType1Code DeemedInterestProceeds = new DeemedRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedInterestProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateType1Code.mmObject();
			codeName = DeemedRateTypeCode.DeemedInterestProceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeemedRateType1Code
	 * DeemedRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRoyaltiesProceeds"</li>
	 * </ul>
	 */
	public static final DeemedRateType1Code DeemedRoyaltiesProceeds = new DeemedRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRoyaltiesProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.DeemedRateType1Code.mmObject();
			codeName = DeemedRateTypeCode.DeemedRoyaltiesProceeds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeemedRateType1Code> codesByName = new LinkedHashMap<>();

	protected DeemedRateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeemedRateType1Code";
				definition = "Specifies the type of a deemed rate.";
				trace_lazy = () -> DeemedRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeemedRateType1Code.DeemedDividendProceeds, com.tools20022.repository.codeset.DeemedRateType1Code.DeemedFundProceeds,
						com.tools20022.repository.codeset.DeemedRateType1Code.DeemedInterestProceeds, com.tools20022.repository.codeset.DeemedRateType1Code.DeemedRoyaltiesProceeds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DeemedDividendProceeds.getCodeName().get(), DeemedDividendProceeds);
		codesByName.put(DeemedFundProceeds.getCodeName().get(), DeemedFundProceeds);
		codesByName.put(DeemedInterestProceeds.getCodeName().get(), DeemedInterestProceeds);
		codesByName.put(DeemedRoyaltiesProceeds.getCodeName().get(), DeemedRoyaltiesProceeds);
	}

	public static DeemedRateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeemedRateType1Code[] values() {
		DeemedRateType1Code[] values = new DeemedRateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeemedRateType1Code> {
		@Override
		public DeemedRateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeemedRateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}