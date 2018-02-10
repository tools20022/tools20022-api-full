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
import com.tools20022.repository.codeset.ShareRanking1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the shares are ranking for dividend or pari passu.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ShareRanking1Code#Dividend
 * ShareRanking1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ShareRanking1Code#PariPassu
 * ShareRanking1Code.PariPassu}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ShareRankingCode
 * ShareRankingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DIVI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ShareRanking1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the shares are ranking for dividend or pari passu."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ShareRanking1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRanking1Code
	 * ShareRanking1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final ShareRanking1Code Dividend = new ShareRanking1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.ShareRanking1Code.mmObject();
			codeName = ShareRankingCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRanking1Code
	 * ShareRanking1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * </ul>
	 */
	public static final ShareRanking1Code PariPassu = new ShareRanking1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			owner_lazy = () -> com.tools20022.repository.codeset.ShareRanking1Code.mmObject();
			codeName = ShareRankingCode.PariPassu.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ShareRanking1Code> codesByName = new LinkedHashMap<>();

	protected ShareRanking1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShareRanking1Code";
				definition = "Specifies whether the shares are ranking for dividend or pari passu.";
				trace_lazy = () -> ShareRankingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ShareRanking1Code.Dividend, com.tools20022.repository.codeset.ShareRanking1Code.PariPassu);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
	}

	public static ShareRanking1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ShareRanking1Code[] values() {
		ShareRanking1Code[] values = new ShareRanking1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ShareRanking1Code> {
		@Override
		public ShareRanking1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ShareRanking1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}