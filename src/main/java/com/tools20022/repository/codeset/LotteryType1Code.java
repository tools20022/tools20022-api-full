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
import com.tools20022.repository.codeset.LotteryType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of lottery.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LotteryType1Code#OriginalLotteryNotification
 * LotteryType1Code.OriginalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LotteryType1Code#SupplementalLotteryNotification
 * LotteryType1Code.SupplementalLotteryNotification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
 * LotteryTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ORIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LotteryType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of lottery."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LotteryType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryType1Code
	 * LotteryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalLotteryNotification"</li>
	 * </ul>
	 */
	public static final LotteryType1Code OriginalLotteryNotification = new LotteryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalLotteryNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.LotteryType1Code.mmObject();
			codeName = LotteryTypeCode.OriginalLotteryNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryType1Code
	 * LotteryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalLotteryNotification"</li>
	 * </ul>
	 */
	public static final LotteryType1Code SupplementalLotteryNotification = new LotteryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalLotteryNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.LotteryType1Code.mmObject();
			codeName = LotteryTypeCode.SupplementalLotteryNotification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LotteryType1Code> codesByName = new LinkedHashMap<>();

	protected LotteryType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ORIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LotteryType1Code";
				definition = "Specifies the type of lottery.";
				trace_lazy = () -> LotteryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LotteryType1Code.OriginalLotteryNotification, com.tools20022.repository.codeset.LotteryType1Code.SupplementalLotteryNotification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OriginalLotteryNotification.getCodeName().get(), OriginalLotteryNotification);
		codesByName.put(SupplementalLotteryNotification.getCodeName().get(), SupplementalLotteryNotification);
	}

	public static LotteryType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LotteryType1Code[] values() {
		LotteryType1Code[] values = new LotteryType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LotteryType1Code> {
		@Override
		public LotteryType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LotteryType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}