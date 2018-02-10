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
import com.tools20022.repository.codeset.FundOwnership1Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code#AllOwned
 * FundOwnership1Code.AllOwned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code#NotAllOwned
 * FundOwnership1Code.NotAllOwned}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOwnershipCode
 * FundOwnershipCode}</li>
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
 * "FundOwnership1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if all the shares are owned exclusively by the fund company."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOwnership1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code
	 * FundOwnership1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOwned"</li>
	 * </ul>
	 */
	public static final FundOwnership1Code AllOwned = new FundOwnership1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOwned";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOwnership1Code.mmObject();
			codeName = FundOwnershipCode.AllOwned.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code
	 * FundOwnership1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllOwned"</li>
	 * </ul>
	 */
	public static final FundOwnership1Code NotAllOwned = new FundOwnership1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllOwned";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOwnership1Code.mmObject();
			codeName = FundOwnershipCode.NotAllOwned.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOwnership1Code> codesByName = new LinkedHashMap<>();

	protected FundOwnership1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOwnership1Code";
				definition = "Specifies if all the shares are owned exclusively by the fund company.";
				trace_lazy = () -> FundOwnershipCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOwnership1Code.AllOwned, com.tools20022.repository.codeset.FundOwnership1Code.NotAllOwned);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOwned.getCodeName().get(), AllOwned);
		codesByName.put(NotAllOwned.getCodeName().get(), NotAllOwned);
	}

	public static FundOwnership1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOwnership1Code[] values() {
		FundOwnership1Code[] values = new FundOwnership1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOwnership1Code> {
		@Override
		public FundOwnership1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOwnership1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}