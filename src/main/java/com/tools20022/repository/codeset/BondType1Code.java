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
import com.tools20022.repository.codeset.BondType1Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondType1Code#SovereignBond
 * BondType1Code.SovereignBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondType1Code#OtherPublicBond
 * BondType1Code.OtherPublicBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondType1Code#ConvertibleBond
 * BondType1Code.ConvertibleBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BondType1Code#CorporateBond
 * BondType1Code.CorporateBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondType1Code#CoveredBond
 * BondType1Code.CoveredBond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BondType1Code#Other
 * BondType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BondTypeCode BondTypeCode}</li>
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
 * "BondType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of bonds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BondType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SovereignBond"</li>
	 * </ul>
	 */
	public static final BondType1Code SovereignBond = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SovereignBond";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.SovereignBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPublicBond"</li>
	 * </ul>
	 */
	public static final BondType1Code OtherPublicBond = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPublicBond";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.OtherPublicBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * </ul>
	 */
	public static final BondType1Code ConvertibleBond = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.ConvertibleBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * </ul>
	 */
	public static final BondType1Code CorporateBond = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.CorporateBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredBond"</li>
	 * </ul>
	 */
	public static final BondType1Code CoveredBond = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.CoveredBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BondType1Code
	 * BondType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final BondType1Code Other = new BondType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.BondType1Code.mmObject();
			codeName = BondTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BondType1Code> codesByName = new LinkedHashMap<>();

	protected BondType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BondType1Code";
				definition = "Specifies the type of bonds.";
				trace_lazy = () -> BondTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BondType1Code.SovereignBond, com.tools20022.repository.codeset.BondType1Code.OtherPublicBond,
						com.tools20022.repository.codeset.BondType1Code.ConvertibleBond, com.tools20022.repository.codeset.BondType1Code.CorporateBond, com.tools20022.repository.codeset.BondType1Code.CoveredBond,
						com.tools20022.repository.codeset.BondType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SovereignBond.getCodeName().get(), SovereignBond);
		codesByName.put(OtherPublicBond.getCodeName().get(), OtherPublicBond);
		codesByName.put(ConvertibleBond.getCodeName().get(), ConvertibleBond);
		codesByName.put(CorporateBond.getCodeName().get(), CorporateBond);
		codesByName.put(CoveredBond.getCodeName().get(), CoveredBond);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static BondType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BondType1Code[] values() {
		BondType1Code[] values = new BondType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BondType1Code> {
		@Override
		public BondType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BondType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}