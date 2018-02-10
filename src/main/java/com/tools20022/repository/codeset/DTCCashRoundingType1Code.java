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
import com.tools20022.repository.codeset.DTCCashRoundingType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code qualifying types of cash rounding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code#RoundDownToTheNearestCent
 * DTCCashRoundingType1Code.RoundDownToTheNearestCent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code#RoundDownToTheNearestDollar
 * DTCCashRoundingType1Code.RoundDownToTheNearestDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code#RoundUpToTheNearestCent
 * DTCCashRoundingType1Code.RoundUpToTheNearestCent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code#RoundUpToTheNearestDollar
 * DTCCashRoundingType1Code.RoundUpToTheNearestDollar}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode
 * DTCCashRoundingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RDNC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCashRoundingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code qualifying types of cash rounding."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCashRoundingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code
	 * DTCCashRoundingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDownToTheNearestCent"</li>
	 * </ul>
	 */
	public static final DTCCashRoundingType1Code RoundDownToTheNearestCent = new DTCCashRoundingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDownToTheNearestCent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingType1Code.mmObject();
			codeName = DTCCashRoundingTypeCode.RoundDownToTheNearestCent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code
	 * DTCCashRoundingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDownToTheNearestDollar"</li>
	 * </ul>
	 */
	public static final DTCCashRoundingType1Code RoundDownToTheNearestDollar = new DTCCashRoundingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDownToTheNearestDollar";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingType1Code.mmObject();
			codeName = DTCCashRoundingTypeCode.RoundDownToTheNearestDollar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code
	 * DTCCashRoundingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUpToTheNearestCent"</li>
	 * </ul>
	 */
	public static final DTCCashRoundingType1Code RoundUpToTheNearestCent = new DTCCashRoundingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUpToTheNearestCent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingType1Code.mmObject();
			codeName = DTCCashRoundingTypeCode.RoundUpToTheNearestCent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code
	 * DTCCashRoundingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUpToTheNearestDollar"</li>
	 * </ul>
	 */
	public static final DTCCashRoundingType1Code RoundUpToTheNearestDollar = new DTCCashRoundingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUpToTheNearestDollar";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingType1Code.mmObject();
			codeName = DTCCashRoundingTypeCode.RoundUpToTheNearestDollar.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCashRoundingType1Code> codesByName = new LinkedHashMap<>();

	protected DTCCashRoundingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RDNC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCashRoundingType1Code";
				definition = "Code qualifying types of cash rounding.";
				trace_lazy = () -> DTCCashRoundingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCashRoundingType1Code.RoundDownToTheNearestCent, com.tools20022.repository.codeset.DTCCashRoundingType1Code.RoundDownToTheNearestDollar,
						com.tools20022.repository.codeset.DTCCashRoundingType1Code.RoundUpToTheNearestCent, com.tools20022.repository.codeset.DTCCashRoundingType1Code.RoundUpToTheNearestDollar);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RoundDownToTheNearestCent.getCodeName().get(), RoundDownToTheNearestCent);
		codesByName.put(RoundDownToTheNearestDollar.getCodeName().get(), RoundDownToTheNearestDollar);
		codesByName.put(RoundUpToTheNearestCent.getCodeName().get(), RoundUpToTheNearestCent);
		codesByName.put(RoundUpToTheNearestDollar.getCodeName().get(), RoundUpToTheNearestDollar);
	}

	public static DTCCashRoundingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCashRoundingType1Code[] values() {
		DTCCashRoundingType1Code[] values = new DTCCashRoundingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCashRoundingType1Code> {
		@Override
		public DTCCashRoundingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCashRoundingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}