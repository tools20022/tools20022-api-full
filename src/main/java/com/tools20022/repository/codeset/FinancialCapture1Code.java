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
import com.tools20022.repository.codeset.FinancialCapture1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Mode for the financial capture of the transaction by the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code#Authorisation
 * FinancialCapture1Code.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code#Completion
 * FinancialCapture1Code.Completion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code#Batch
 * FinancialCapture1Code.Batch}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
 * FinancialCaptureCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AUTH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialCapture1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mode for the financial capture of the transaction by the acquirer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialCapture1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * </ul>
	 */
	public static final FinancialCapture1Code Authorisation = new FinancialCapture1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCapture1Code.mmObject();
			codeName = FinancialCaptureCode.Authorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completion"</li>
	 * </ul>
	 */
	public static final FinancialCapture1Code Completion = new FinancialCapture1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completion";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCapture1Code.mmObject();
			codeName = FinancialCaptureCode.Completion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Batch"</li>
	 * </ul>
	 */
	public static final FinancialCapture1Code Batch = new FinancialCapture1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Batch";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCapture1Code.mmObject();
			codeName = FinancialCaptureCode.Batch.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancialCapture1Code> codesByName = new LinkedHashMap<>();

	protected FinancialCapture1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialCapture1Code";
				definition = "Mode for the financial capture of the transaction by the acquirer.";
				trace_lazy = () -> FinancialCaptureCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialCapture1Code.Authorisation, com.tools20022.repository.codeset.FinancialCapture1Code.Completion,
						com.tools20022.repository.codeset.FinancialCapture1Code.Batch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Authorisation.getCodeName().get(), Authorisation);
		codesByName.put(Completion.getCodeName().get(), Completion);
		codesByName.put(Batch.getCodeName().get(), Batch);
	}

	public static FinancialCapture1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialCapture1Code[] values() {
		FinancialCapture1Code[] values = new FinancialCapture1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialCapture1Code> {
		@Override
		public FinancialCapture1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialCapture1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}