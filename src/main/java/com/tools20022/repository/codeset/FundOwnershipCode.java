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
import com.tools20022.repository.codeset.FundOwnershipCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if all the shares are owned exclusively by the fund company.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOwnershipCode#AllOwned
 * FundOwnershipCode.AllOwned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOwnershipCode#NotAllOwned
 * FundOwnershipCode.NotAllOwned}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOwnership1Code
 * FundOwnership1Code}</li>
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
 * "FundOwnershipCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if all the shares are owned exclusively by the fund company."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOwnershipCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All shares owned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnershipCode
	 * FundOwnershipCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOwned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All shares owned."</li>
	 * </ul>
	 */
	public static final FundOwnershipCode AllOwned = new FundOwnershipCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOwned";
			definition = "All shares owned.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOwnershipCode.mmObject();
			codeName = "YALL";
		}
	};
	/**
	 * Not all shares owned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnershipCode
	 * FundOwnershipCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllOwned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not all shares owned."</li>
	 * </ul>
	 */
	public static final FundOwnershipCode NotAllOwned = new FundOwnershipCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllOwned";
			definition = "Not all shares owned.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOwnershipCode.mmObject();
			codeName = "NALL";
		}
	};
	final static private LinkedHashMap<String, FundOwnershipCode> codesByName = new LinkedHashMap<>();

	protected FundOwnershipCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOwnershipCode";
				definition = "Specifies if all the shares are owned exclusively by the fund company.";
				derivation_lazy = () -> Arrays.asList(FundOwnership1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOwnershipCode.AllOwned, com.tools20022.repository.codeset.FundOwnershipCode.NotAllOwned);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOwned.getCodeName().get(), AllOwned);
		codesByName.put(NotAllOwned.getCodeName().get(), NotAllOwned);
	}

	public static FundOwnershipCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOwnershipCode[] values() {
		FundOwnershipCode[] values = new FundOwnershipCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOwnershipCode> {
		@Override
		public FundOwnershipCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOwnershipCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}