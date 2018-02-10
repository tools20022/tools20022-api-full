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
import com.tools20022.repository.codeset.BondTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of bonds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#SovereignBond
 * BondTypeCode.SovereignBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#NonEuropeanSovereignBond
 * BondTypeCode.NonEuropeanSovereignBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#OtherPublicBond
 * BondTypeCode.OtherPublicBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#ConvertibleBond
 * BondTypeCode.ConvertibleBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#CoveredBond
 * BondTypeCode.CoveredBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#CorporateBond
 * BondTypeCode.CorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode#OtherNonEuropeanPublicBond
 * BondTypeCode.OtherNonEuropeanPublicBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondTypeCode#Other
 * BondTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BondType1Code
 * BondType1Code}</li>
 * </ul>
 * </li>
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
 * "BondTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of bonds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BondTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Bond of type sovereign bond.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type sovereign bond.\r\n"</li>
	 * </ul>
	 */
	public static final BondTypeCode SovereignBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignBond";
			definition = "Bond of type sovereign bond.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "EUSB";
		}
	};
	/**
	 * Bond of type non-european sovereign bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NESB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEuropeanSovereignBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type non-european sovereign bond."</li>
	 * </ul>
	 */
	public static final BondTypeCode NonEuropeanSovereignBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEuropeanSovereignBond";
			definition = "Bond of type non-european sovereign bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "NESB";
		}
	};
	/**
	 * Bond of type other public bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OEPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPublicBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type other public bond."</li>
	 * </ul>
	 */
	public static final BondTypeCode OtherPublicBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPublicBond";
			definition = "Bond of type other public bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "OEPB";
		}
	};
	/**
	 * Bond of type convertible bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type convertible bond."</li>
	 * </ul>
	 */
	public static final BondTypeCode ConvertibleBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			definition = "Bond of type convertible bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "CVTB";
		}
	};
	/**
	 * Bond of type covered Bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type covered Bond."</li>
	 * </ul>
	 */
	public static final BondTypeCode CoveredBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			definition = "Bond of type covered Bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "CVDB";
		}
	};
	/**
	 * Bond of type corporate Bond.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type corporate Bond.\r\n"</li>
	 * </ul>
	 */
	public static final BondTypeCode CorporateBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			definition = "Bond of type corporate Bond.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "CRPB";
		}
	};
	/**
	 * Bond of type other non-european public bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonEuropeanPublicBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond of type other non-european public bond."</li>
	 * </ul>
	 */
	public static final BondTypeCode OtherNonEuropeanPublicBond = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonEuropeanPublicBond";
			definition = "Bond of type other non-european public bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "ONEP";
		}
	};
	/**
	 * Other bond type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other bond type."</li>
	 * </ul>
	 */
	public static final BondTypeCode Other = new BondTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other bond type.";
			owner_lazy = () -> com.tools20022.repository.codeset.BondTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, BondTypeCode> codesByName = new LinkedHashMap<>();

	protected BondTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BondTypeCode";
				definition = "Specifies the type of bonds.";
				derivation_lazy = () -> Arrays.asList(BondType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BondTypeCode.SovereignBond, com.tools20022.repository.codeset.BondTypeCode.NonEuropeanSovereignBond,
						com.tools20022.repository.codeset.BondTypeCode.OtherPublicBond, com.tools20022.repository.codeset.BondTypeCode.ConvertibleBond, com.tools20022.repository.codeset.BondTypeCode.CoveredBond,
						com.tools20022.repository.codeset.BondTypeCode.CorporateBond, com.tools20022.repository.codeset.BondTypeCode.OtherNonEuropeanPublicBond, com.tools20022.repository.codeset.BondTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SovereignBond.getCodeName().get(), SovereignBond);
		codesByName.put(NonEuropeanSovereignBond.getCodeName().get(), NonEuropeanSovereignBond);
		codesByName.put(OtherPublicBond.getCodeName().get(), OtherPublicBond);
		codesByName.put(ConvertibleBond.getCodeName().get(), ConvertibleBond);
		codesByName.put(CoveredBond.getCodeName().get(), CoveredBond);
		codesByName.put(CorporateBond.getCodeName().get(), CorporateBond);
		codesByName.put(OtherNonEuropeanPublicBond.getCodeName().get(), OtherNonEuropeanPublicBond);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static BondTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BondTypeCode[] values() {
		BondTypeCode[] values = new BondTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BondTypeCode> {
		@Override
		public BondTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BondTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}