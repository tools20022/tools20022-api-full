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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification5;
import com.tools20022.repository.msg.EncapsulatedContent1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Digest computed on the identified data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DigestedData2#mmVersion
 * DigestedData2.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DigestedData2#mmDigestAlgorithm
 * DigestedData2.mmDigestAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DigestedData2#mmEncapsulatedContent
 * DigestedData2.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DigestedData2#mmDigest
 * DigestedData2.mmDigest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DigestedData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Digest computed on the identified data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DigestedData3 DigestedData3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.DigestedData1
 * DigestedData1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DigestedData2", propOrder = {"version", "digestAlgorithm", "encapsulatedContent", "digest"})
public class DigestedData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData2 DigestedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DigestedData3#mmVersion
	 * DigestedData3.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DigestedData2, Optional<Number>> mmVersion = new MMMessageAttribute<DigestedData2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(DigestedData3.mmVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DigestedData2 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(DigestedData2 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstAlgo", required = true)
	protected List<AlgorithmIdentification5> digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification5
	 * AlgorithmIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData2 DigestedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a digest algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DigestedData3#mmDigestAlgorithm
	 * DigestedData3.mmDigestAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DigestedData2, List<AlgorithmIdentification5>> mmDigestAlgorithm = new MMMessageAssociationEnd<DigestedData2, List<AlgorithmIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData2.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of a digest algorithm.";
			nextVersions_lazy = () -> Arrays.asList(DigestedData3.mmDigestAlgorithm);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification5.mmObject();
		}

		@Override
		public List<AlgorithmIdentification5> getValue(DigestedData2 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(DigestedData2 obj, List<AlgorithmIdentification5> value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "NcpsltdCntt", required = true)
	protected EncapsulatedContent1 encapsulatedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent1
	 * EncapsulatedContent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData2 DigestedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcpsltdCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncapsulatedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data on which the digest is computed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DigestedData3#mmEncapsulatedContent
	 * DigestedData3.mmEncapsulatedContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DigestedData2, EncapsulatedContent1> mmEncapsulatedContent = new MMMessageAssociationEnd<DigestedData2, EncapsulatedContent1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData2.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data on which the digest is computed.";
			nextVersions_lazy = () -> Arrays.asList(DigestedData3.mmEncapsulatedContent);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncapsulatedContent1.mmObject();
		}

		@Override
		public EncapsulatedContent1 getValue(DigestedData2 obj) {
			return obj.getEncapsulatedContent();
		}

		@Override
		public void setValue(DigestedData2 obj, EncapsulatedContent1 value) {
			obj.setEncapsulatedContent(value);
		}
	};
	@XmlElement(name = "Dgst", required = true)
	protected Max140Text digest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData2 DigestedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dgst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of data-digesting process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DigestedData3#mmDigest
	 * DigestedData3.mmDigest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DigestedData2, Max140Text> mmDigest = new MMMessageAttribute<DigestedData2, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData2.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Result of data-digesting process.";
			nextVersions_lazy = () -> Arrays.asList(DigestedData3.mmDigest);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(DigestedData2 obj) {
			return obj.getDigest();
		}

		@Override
		public void setValue(DigestedData2 obj, Max140Text value) {
			obj.setDigest(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DigestedData2.mmVersion, com.tools20022.repository.msg.DigestedData2.mmDigestAlgorithm,
						com.tools20022.repository.msg.DigestedData2.mmEncapsulatedContent, com.tools20022.repository.msg.DigestedData2.mmDigest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DigestedData2";
				definition = "Digest computed on the identified data.";
				nextVersions_lazy = () -> Arrays.asList(DigestedData3.mmObject());
				previousVersion_lazy = () -> DigestedData1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public DigestedData2 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public List<AlgorithmIdentification5> getDigestAlgorithm() {
		return digestAlgorithm == null ? digestAlgorithm = new ArrayList<>() : digestAlgorithm;
	}

	public DigestedData2 setDigestAlgorithm(List<AlgorithmIdentification5> digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public EncapsulatedContent1 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public DigestedData2 setEncapsulatedContent(EncapsulatedContent1 encapsulatedContent) {
		this.encapsulatedContent = Objects.requireNonNull(encapsulatedContent);
		return this;
	}

	public Max140Text getDigest() {
		return digest;
	}

	public DigestedData2 setDigest(Max140Text digest) {
		this.digest = Objects.requireNonNull(digest);
		return this;
	}
}