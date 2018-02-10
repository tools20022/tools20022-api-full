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
import com.tools20022.repository.codeset.CorporateActionEventStage4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the stage of the CA lottery event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code#CancellationAndReRun
 * CorporateActionEventStage4Code.CancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code#SupplementalCancellationAndReRun
 * CorporateActionEventStage4Code.SupplementalCancellationAndReRun}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code#SupplementalCancellation
 * CorporateActionEventStage4Code.SupplementalCancellation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStageV2Code
 * CorporateActionEventStageV2Code}</li>
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
 * "CorporateActionEventStage4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the stage of the CA lottery event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStage4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code
	 * CorporateActionEventStage4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAndReRun"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage4Code CancellationAndReRun = new CorporateActionEventStage4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAndReRun";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage4Code.mmObject();
			codeName = CorporateActionEventStageV2Code.CancellationAndReRun.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code
	 * CorporateActionEventStage4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellationAndReRun"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage4Code SupplementalCancellationAndReRun = new CorporateActionEventStage4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellationAndReRun";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage4Code.mmObject();
			codeName = CorporateActionEventStageV2Code.SupplementalCancellationAndReRun.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStage4Code
	 * CorporateActionEventStage4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalCancellation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStage4Code SupplementalCancellation = new CorporateActionEventStage4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStage4Code.mmObject();
			codeName = CorporateActionEventStageV2Code.SupplementalCancellation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStage4Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStage4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStage4Code";
				definition = "Specifies the stage of the CA lottery event.";
				trace_lazy = () -> CorporateActionEventStageV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStage4Code.CancellationAndReRun, com.tools20022.repository.codeset.CorporateActionEventStage4Code.SupplementalCancellationAndReRun,
						com.tools20022.repository.codeset.CorporateActionEventStage4Code.SupplementalCancellation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancellationAndReRun.getCodeName().get(), CancellationAndReRun);
		codesByName.put(SupplementalCancellationAndReRun.getCodeName().get(), SupplementalCancellationAndReRun);
		codesByName.put(SupplementalCancellation.getCodeName().get(), SupplementalCancellation);
	}

	public static CorporateActionEventStage4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStage4Code[] values() {
		CorporateActionEventStage4Code[] values = new CorporateActionEventStage4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStage4Code> {
		@Override
		public CorporateActionEventStage4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStage4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}