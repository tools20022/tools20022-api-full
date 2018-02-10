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
import com.tools20022.repository.codeset.ErrorHandling1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Error codes generated when the response to a query exceeds the maximum size
 * or the data is not available.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code#DataNotYetAvailable
 * ErrorHandling1Code.DataNotYetAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code#MessageSizeLimitExceeded
 * ErrorHandling1Code.MessageSizeLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code#DataNotAvailable
 * ErrorHandling1Code.DataNotAvailable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
 * ErrorHandlingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"X020"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ErrorHandling1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Error codes generated when the response to a query exceeds the maximum size or the data is not available."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ErrorHandling1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code
	 * ErrorHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotYetAvailable"</li>
	 * </ul>
	 */
	public static final ErrorHandling1Code DataNotYetAvailable = new ErrorHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotYetAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandling1Code.mmObject();
			codeName = ErrorHandlingCode.DataNotYetAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code
	 * ErrorHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageSizeLimitExceeded"</li>
	 * </ul>
	 */
	public static final ErrorHandling1Code MessageSizeLimitExceeded = new ErrorHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageSizeLimitExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandling1Code.mmObject();
			codeName = ErrorHandlingCode.MessageSizeLimitExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandling1Code
	 * ErrorHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotAvailable"</li>
	 * </ul>
	 */
	public static final ErrorHandling1Code DataNotAvailable = new ErrorHandling1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandling1Code.mmObject();
			codeName = ErrorHandlingCode.DataNotAvailable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ErrorHandling1Code> codesByName = new LinkedHashMap<>();

	protected ErrorHandling1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("X020");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ErrorHandling1Code";
				definition = "Error codes generated when the response to a query exceeds the maximum size or the data is not available.";
				trace_lazy = () -> ErrorHandlingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ErrorHandling1Code.DataNotYetAvailable, com.tools20022.repository.codeset.ErrorHandling1Code.MessageSizeLimitExceeded,
						com.tools20022.repository.codeset.ErrorHandling1Code.DataNotAvailable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DataNotYetAvailable.getCodeName().get(), DataNotYetAvailable);
		codesByName.put(MessageSizeLimitExceeded.getCodeName().get(), MessageSizeLimitExceeded);
		codesByName.put(DataNotAvailable.getCodeName().get(), DataNotAvailable);
	}

	public static ErrorHandling1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ErrorHandling1Code[] values() {
		ErrorHandling1Code[] values = new ErrorHandling1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ErrorHandling1Code> {
		@Override
		public ErrorHandling1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ErrorHandling1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}