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
import com.tools20022.repository.codeset.Response1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Response code of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Response1Code#Declined
 * Response1Code.Declined}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Response1Code#Approved
 * Response1Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Response1Code#PartialApproved
 * Response1Code.PartialApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Response1Code#TechnicalError
 * Response1Code.TechnicalError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResponseCode ResponseCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DECL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Response1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response code of a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Response1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declined"</li>
	 * </ul>
	 */
	public static final Response1Code Declined = new Response1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declined";
			owner_lazy = () -> com.tools20022.repository.codeset.Response1Code.mmObject();
			codeName = ResponseCode.Declined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * </ul>
	 */
	public static final Response1Code Approved = new Response1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			owner_lazy = () -> com.tools20022.repository.codeset.Response1Code.mmObject();
			codeName = ResponseCode.Approved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialApproved"</li>
	 * </ul>
	 */
	public static final Response1Code PartialApproved = new Response1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialApproved";
			owner_lazy = () -> com.tools20022.repository.codeset.Response1Code.mmObject();
			codeName = ResponseCode.PartialApproved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalError"</li>
	 * </ul>
	 */
	public static final Response1Code TechnicalError = new Response1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalError";
			owner_lazy = () -> com.tools20022.repository.codeset.Response1Code.mmObject();
			codeName = ResponseCode.TechnicalError.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Response1Code> codesByName = new LinkedHashMap<>();

	protected Response1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DECL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Response1Code";
				definition = "Response code of a transaction.";
				trace_lazy = () -> ResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Response1Code.Declined, com.tools20022.repository.codeset.Response1Code.Approved, com.tools20022.repository.codeset.Response1Code.PartialApproved,
						com.tools20022.repository.codeset.Response1Code.TechnicalError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Declined.getCodeName().get(), Declined);
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(PartialApproved.getCodeName().get(), PartialApproved);
		codesByName.put(TechnicalError.getCodeName().get(), TechnicalError);
	}

	public static Response1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Response1Code[] values() {
		Response1Code[] values = new Response1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Response1Code> {
		@Override
		public Response1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Response1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}