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
import com.tools20022.repository.codeset.ErrorHandlingCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#DataNotYetAvailable
 * ErrorHandlingCode.DataNotYetAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#MessageSizeLimitExceeded
 * ErrorHandlingCode.MessageSizeLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#DataNotAvailable
 * ErrorHandlingCode.DataNotAvailable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ErrorHandling1Code
 * ErrorHandling1Code}</li>
 * </ul>
 * </li>
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
 * "ErrorHandlingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Error codes generated when the response to a query exceeds the maximum size or the data is not available."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ErrorHandlingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the error code when the data requested are not yet available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X020"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotYetAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested are not yet available."
	 * </li>
	 * </ul>
	 */
	public static final ErrorHandlingCode DataNotYetAvailable = new ErrorHandlingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotYetAvailable";
			definition = "Specifies the error code when the data requested are not yet available.";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandlingCode.mmObject();
			codeName = "X020";
		}
	};
	/**
	 * Specifies the error code when the data requested generates a message size
	 * that exceed the processing capacity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X030"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageSizeLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested generates a message size that exceed the processing capacity."
	 * </li>
	 * </ul>
	 */
	public static final ErrorHandlingCode MessageSizeLimitExceeded = new ErrorHandlingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageSizeLimitExceeded";
			definition = "Specifies the error code when the data requested generates a message size that exceed the processing capacity.";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandlingCode.mmObject();
			codeName = "X030";
		}
	};
	/**
	 * Specifies the error code when the data requested have not been found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X050"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested have not been found."</li>
	 * </ul>
	 */
	public static final ErrorHandlingCode DataNotAvailable = new ErrorHandlingCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotAvailable";
			definition = "Specifies the error code when the data requested have not been found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ErrorHandlingCode.mmObject();
			codeName = "X050";
		}
	};
	final static private LinkedHashMap<String, ErrorHandlingCode> codesByName = new LinkedHashMap<>();

	protected ErrorHandlingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("X020");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ErrorHandlingCode";
				definition = "Error codes generated when the response to a query exceeds the maximum size or the data is not available.";
				derivation_lazy = () -> Arrays.asList(ErrorHandling1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ErrorHandlingCode.DataNotYetAvailable, com.tools20022.repository.codeset.ErrorHandlingCode.MessageSizeLimitExceeded,
						com.tools20022.repository.codeset.ErrorHandlingCode.DataNotAvailable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DataNotYetAvailable.getCodeName().get(), DataNotYetAvailable);
		codesByName.put(MessageSizeLimitExceeded.getCodeName().get(), MessageSizeLimitExceeded);
		codesByName.put(DataNotAvailable.getCodeName().get(), DataNotAvailable);
	}

	public static ErrorHandlingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ErrorHandlingCode[] values() {
		ErrorHandlingCode[] values = new ErrorHandlingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ErrorHandlingCode> {
		@Override
		public ErrorHandlingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ErrorHandlingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}