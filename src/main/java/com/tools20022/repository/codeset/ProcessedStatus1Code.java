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
import com.tools20022.repository.codeset.ProcessedStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status of the notification advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code#Received
 * ProcessedStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code#SentToMarket
 * ProcessedStatus1Code.SentToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code#AcceptedWithWarning
 * ProcessedStatus1Code.AcceptedWithWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code#Accepted
 * ProcessedStatus1Code.Accepted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionProcessedStatusCode
 * CorporateActionProcessedStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessedStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing status of the notification advice."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessedStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code
	 * ProcessedStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final ProcessedStatus1Code Received = new ProcessedStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessedStatus1Code.mmObject();
			codeName = CorporateActionProcessedStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code
	 * ProcessedStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToMarket"</li>
	 * </ul>
	 */
	public static final ProcessedStatus1Code SentToMarket = new ProcessedStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessedStatus1Code.mmObject();
			codeName = CorporateActionProcessedStatusCode.SentToMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code
	 * ProcessedStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithWarning"</li>
	 * </ul>
	 */
	public static final ProcessedStatus1Code AcceptedWithWarning = new ProcessedStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithWarning";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessedStatus1Code.mmObject();
			codeName = CorporateActionProcessedStatusCode.AcceptedWithWarning.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessedStatus1Code
	 * ProcessedStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final ProcessedStatus1Code Accepted = new ProcessedStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessedStatus1Code.mmObject();
			codeName = CorporateActionProcessedStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProcessedStatus1Code> codesByName = new LinkedHashMap<>();

	protected ProcessedStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessedStatus1Code";
				definition = "Specifies the processing status of the notification advice.";
				trace_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessedStatus1Code.Received, com.tools20022.repository.codeset.ProcessedStatus1Code.SentToMarket,
						com.tools20022.repository.codeset.ProcessedStatus1Code.AcceptedWithWarning, com.tools20022.repository.codeset.ProcessedStatus1Code.Accepted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(SentToMarket.getCodeName().get(), SentToMarket);
		codesByName.put(AcceptedWithWarning.getCodeName().get(), AcceptedWithWarning);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
	}

	public static ProcessedStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessedStatus1Code[] values() {
		ProcessedStatus1Code[] values = new ProcessedStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessedStatus1Code> {
		@Override
		public ProcessedStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessedStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}