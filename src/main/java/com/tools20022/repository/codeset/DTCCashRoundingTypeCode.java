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
import com.tools20022.repository.codeset.DTCCashRoundingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies types of cash rounding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode#RoundDownToTheNearestCent
 * DTCCashRoundingTypeCode.RoundDownToTheNearestCent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode#RoundDownToTheNearestDollar
 * DTCCashRoundingTypeCode.RoundDownToTheNearestDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode#RoundUpToTheNearestCent
 * DTCCashRoundingTypeCode.RoundUpToTheNearestCent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode#RoundUpToTheNearestDollar
 * DTCCashRoundingTypeCode.RoundUpToTheNearestDollar}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCashRoundingType1Code
 * DTCCashRoundingType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCashRoundingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies types of cash rounding."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCashRoundingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Round down to the nearest cent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode
	 * DTCCashRoundingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDNC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDownToTheNearestCent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round down to the nearest cent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCashRoundingTypeCode RoundDownToTheNearestCent = new DTCCashRoundingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDownToTheNearestCent";
			definition = "Round down to the nearest cent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingTypeCode.mmObject();
			codeName = "RDNC";
		}
	};
	/**
	 * Round down to the nearest dollar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode
	 * DTCCashRoundingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDownToTheNearestDollar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round down to the nearest dollar."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCashRoundingTypeCode RoundDownToTheNearestDollar = new DTCCashRoundingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDownToTheNearestDollar";
			definition = "Round down to the nearest dollar.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingTypeCode.mmObject();
			codeName = "RDND";
		}
	};
	/**
	 * Round up to the nearest cent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode
	 * DTCCashRoundingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RUNC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUpToTheNearestCent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up to the nearest cent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCashRoundingTypeCode RoundUpToTheNearestCent = new DTCCashRoundingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUpToTheNearestCent";
			definition = "Round up to the nearest cent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingTypeCode.mmObject();
			codeName = "RUNC";
		}
	};
	/**
	 * Round up to the nearest dollar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCashRoundingTypeCode
	 * DTCCashRoundingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RUND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUpToTheNearestDollar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up to the nearest dollar."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCashRoundingTypeCode RoundUpToTheNearestDollar = new DTCCashRoundingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUpToTheNearestDollar";
			definition = "Round up to the nearest dollar.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCashRoundingTypeCode.mmObject();
			codeName = "RUND";
		}
	};
	final static private LinkedHashMap<String, DTCCashRoundingTypeCode> codesByName = new LinkedHashMap<>();

	protected DTCCashRoundingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RDNC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCashRoundingTypeCode";
				definition = "Specifies types of cash rounding.";
				derivation_lazy = () -> Arrays.asList(DTCCashRoundingType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCashRoundingTypeCode.RoundDownToTheNearestCent, com.tools20022.repository.codeset.DTCCashRoundingTypeCode.RoundDownToTheNearestDollar,
						com.tools20022.repository.codeset.DTCCashRoundingTypeCode.RoundUpToTheNearestCent, com.tools20022.repository.codeset.DTCCashRoundingTypeCode.RoundUpToTheNearestDollar);
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

	public static DTCCashRoundingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCashRoundingTypeCode[] values() {
		DTCCashRoundingTypeCode[] values = new DTCCashRoundingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCashRoundingTypeCode> {
		@Override
		public DTCCashRoundingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCashRoundingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}