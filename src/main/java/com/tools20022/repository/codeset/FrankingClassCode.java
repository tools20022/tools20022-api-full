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
import com.tools20022.repository.codeset.FrankingClassCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code defining the dvidend / distribution class where this franking
 * information applies to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode#CashDividend
 * FrankingClassCode.CashDividend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrankingClassCode#Interest
 * FrankingClassCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode#NZDDeclared
 * FrankingClassCode.NZDDeclared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode#ScripDividend
 * FrankingClassCode.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode#SpecialDividend
 * FrankingClassCode.SpecialDividend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FrankingClass1Code
 * FrankingClass1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FrankingClassCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code defining the dvidend / distribution class where this franking information applies to."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FrankingClassCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Franking information applies to ordinary cash dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode
	 * FrankingClassCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Franking information applies to ordinary cash dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FrankingClassCode CashDividend = new FrankingClassCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Franking information applies to ordinary cash dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrankingClassCode.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Franking information applies to interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode
	 * FrankingClassCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Franking information applies to interest payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FrankingClassCode Interest = new FrankingClassCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Franking information applies to interest payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrankingClassCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Franking information applies to NZD Declared dividend/distributions -
	 * supplementary dividend/distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode
	 * FrankingClassCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NZDD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NZDDeclared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Franking information applies to NZD Declared dividend/distributions - supplementary dividend/distribution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FrankingClassCode NZDDeclared = new FrankingClassCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NZDDeclared";
			definition = "Franking information applies to NZD Declared dividend/distributions - supplementary dividend/distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrankingClassCode.mmObject();
			codeName = "NZDD";
		}
	};
	/**
	 * Franking information applies to scrip dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode
	 * FrankingClassCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Franking information applies to scrip dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FrankingClassCode ScripDividend = new FrankingClassCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			definition = "Franking information applies to scrip dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrankingClassCode.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Franking information applies to special dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClassCode
	 * FrankingClassCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Franking information applies to special dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FrankingClassCode SpecialDividend = new FrankingClassCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividend";
			definition = "Franking information applies to special dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrankingClassCode.mmObject();
			codeName = "SPEC";
		}
	};
	final static private LinkedHashMap<String, FrankingClassCode> codesByName = new LinkedHashMap<>();

	protected FrankingClassCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrankingClassCode";
				definition = "Code defining the dvidend / distribution class where this franking information applies to.";
				derivation_lazy = () -> Arrays.asList(FrankingClass1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrankingClassCode.CashDividend, com.tools20022.repository.codeset.FrankingClassCode.Interest,
						com.tools20022.repository.codeset.FrankingClassCode.NZDDeclared, com.tools20022.repository.codeset.FrankingClassCode.ScripDividend, com.tools20022.repository.codeset.FrankingClassCode.SpecialDividend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(NZDDeclared.getCodeName().get(), NZDDeclared);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SpecialDividend.getCodeName().get(), SpecialDividend);
	}

	public static FrankingClassCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FrankingClassCode[] values() {
		FrankingClassCode[] values = new FrankingClassCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FrankingClassCode> {
		@Override
		public FrankingClassCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FrankingClassCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}